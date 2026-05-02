package parkingmanager;

import model.ParkingSlot;
import model.Vehicle;
import parkingstrategy.ParkingStrategy;

import java.util.List;

public abstract class ParkingManager {

    public List<ParkingSlot> parkingSlots;
    public ParkingStrategy parkingStrategy;


    public ParkingManager(List<ParkingSlot> parkingSlots, ParkingStrategy parkingStrategy) {
        this.parkingSlots = parkingSlots;
        this.parkingStrategy = parkingStrategy;
    }


    public ParkingSlot bookSlot(Vehicle vehicle) {
        List<ParkingSlot> validSlots = parkingSlots.stream().filter(s -> !s.isOccupied()).filter(s -> s.getVehicleType().equals(vehicle.getVehicleType())).toList();

        if (validSlots.isEmpty()) {
            return null;
        }

        ParkingSlot slot = parkingStrategy.pickSlot(validSlots);
        slot.setOccupied(true);

        return slot;
    }

}
