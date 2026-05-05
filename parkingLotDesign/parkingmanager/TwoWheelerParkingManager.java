package parkingLotDesign.parkingmanager;

import parkingLotDesign.model.ParkingSlot;
import parkingLotDesign.parkingstrategy.ParkingStrategy;

import java.util.List;

public class TwoWheelerParkingManager extends ParkingManager {


    public TwoWheelerParkingManager(List<ParkingSlot> parkingSlots, ParkingStrategy parkingStrategy) {
        super(parkingSlots, parkingStrategy);
    }


}
