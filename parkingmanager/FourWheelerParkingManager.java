package parkingmanager;

import model.ParkingSlot;
import parkingstrategy.ParkingStrategy;

import java.util.List;

public class FourWheelerParkingManager extends ParkingManager {

    public FourWheelerParkingManager(List<ParkingSlot> parkingSlots, ParkingStrategy parkingStrategy) {
        super(parkingSlots, parkingStrategy);
    }

}
