package parkingmanager;

import model.ParkingSlot;
import parkingstrategy.ParkingStrategy;

import java.util.List;

public class TwoWheelerParkingManager extends ParkingManager {


    public TwoWheelerParkingManager(List<ParkingSlot> parkingSlots, ParkingStrategy parkingStrategy) {
        super(parkingSlots, parkingStrategy);
    }


}
