package parkingLotDesign.parking;

import parkingLotDesign.Utils.Util;
import parkingLotDesign.enums.TicketStatus;
import parkingLotDesign.enums.VehicleType;
import parkingLotDesign.floor.FloorManager;
import parkingLotDesign.model.Floor;
import parkingLotDesign.model.ParkingSlot;
import parkingLotDesign.model.Ticket;
import parkingLotDesign.model.Vehicle;
import parkingLotDesign.parkingmanager.ParkingManager;
import parkingLotDesign.price.PricingStrategy;

import java.util.Map;
import java.util.Optional;

public class ParkingLot {

    FloorManager floorManager;

    PricingStrategy pricingStrategy;


    public ParkingLot(FloorManager floorManager, PricingStrategy pricingStrategy) {
        this.floorManager = floorManager;
        this.pricingStrategy = pricingStrategy;
    }

    public Ticket parkVehicle(Vehicle vehicle) {

        for(Floor floor : floorManager.getFloors()){

            if(!floor.isFloorFull()){
                ParkingSlot slot =  floor.getManagerMap().get(vehicle.getVehicleType()).bookSlot(vehicle);
                if(slot == null ){
                    continue;
                }
                return new Ticket(Util.generateUUID(), TicketStatus.OPEN, vehicle.getVehicleNumber(), vehicle.getVehicleType(), floor.getFloor(), slot.getSlotId(), System.currentTimeMillis(), 0);
            }
        }
        throw new RuntimeException("slots are unavailable");
    }


    public void releaseSlot(Ticket ticket) {

        Optional<Floor> floor = floorManager.getFloors().stream().filter(f -> f.getFloor() == ticket.getFloorNumber()).findFirst();

        if(floor.isEmpty()){
            throw new RuntimeException("unable to find floor");
        }

        ParkingManager manager = floor.get().getManagerMap().get(ticket.getVehicleType());


        for (ParkingSlot slot : manager.parkingSlots) {
            if (slot.getSlotId().equals(ticket.getSlotId())) {
                slot.setOccupied(false);
                ticket.setStatus(TicketStatus.CLOSED);

                floor.get().setFloorFull(false);

                System.out.println("released slot : " + slot.getSlotId() + " total amount to be paid : "+ calculateAmount(ticket));
                break;
            }
        }

    }

    public double calculateAmount(Ticket ticket){
       return pricingStrategy.calculateAmount(ticket);
    }
}
