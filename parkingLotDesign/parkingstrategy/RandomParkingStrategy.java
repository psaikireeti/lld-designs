package parkingLotDesign.parkingstrategy;

import parkingLotDesign.model.ParkingSlot;

import java.util.List;
import java.util.Random;

public class RandomParkingStrategy implements ParkingStrategy {

    @Override
    public ParkingSlot pickSlot(List<ParkingSlot> parkingSlots) {

        return parkingSlots.get(new Random().nextInt(0, parkingSlots.size()));

    }
}
