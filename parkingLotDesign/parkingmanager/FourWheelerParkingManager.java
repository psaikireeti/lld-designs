package parkingLotDesign.parkingmanager;

import parkingLotDesign.model.ParkingSlot;
import parkingLotDesign.parkingstrategy.ParkingStrategy;

import java.util.List;

public class FourWheelerParkingManager extends ParkingManager {

    public FourWheelerParkingManager(List<ParkingSlot> parkingSlots, ParkingStrategy parkingStrategy) {
        super(parkingSlots, parkingStrategy);
    }

}
