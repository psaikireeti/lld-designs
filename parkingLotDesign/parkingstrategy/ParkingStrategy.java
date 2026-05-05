package parkingLotDesign.parkingstrategy;

import parkingLotDesign.model.ParkingSlot;

import java.util.List;

public interface ParkingStrategy {

    ParkingSlot pickSlot(List<ParkingSlot> parkingSlots);

}
