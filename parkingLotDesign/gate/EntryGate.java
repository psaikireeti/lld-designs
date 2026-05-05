package parkingLotDesign.gate;

import parkingLotDesign.Utils.Util;
import parkingLotDesign.model.ParkingSlot;
import parkingLotDesign.model.Ticket;
import parkingLotDesign.model.Vehicle;
import parkingLotDesign.parking.ParkingLot;

public class EntryGate {

    ParkingLot parkingLot;

    public EntryGate(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public Ticket generateTicket(Vehicle vehicle) {

        return parkingLot.parkVehicle(vehicle);
    }

}
