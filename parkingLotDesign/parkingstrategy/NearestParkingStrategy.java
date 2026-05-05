package parkingLotDesign.parkingstrategy;

import parkingLotDesign.model.ParkingSlot;

import java.util.List;

public class NearestParkingStrategy implements ParkingStrategy {
    @Override
    public ParkingSlot pickSlot(List<ParkingSlot> parkingSlots) {
        return parkingSlots.getFirst();
    }
}
