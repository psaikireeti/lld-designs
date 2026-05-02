package parkingstrategy;

import model.ParkingSlot;

import java.util.List;

public interface ParkingStrategy {

    ParkingSlot pickSlot(List<ParkingSlot> parkingSlots);

}
