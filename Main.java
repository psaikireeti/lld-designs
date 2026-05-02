import enums.VehicleType;
import floor.FloorManager;
import gate.EntryGate;
import gate.ExitGate;
import model.Floor;
import model.ParkingSlot;
import model.Ticket;
import model.Vehicle;
import parking.ParkingLot;
import parkingmanager.FourWheelerParkingManager;
import parkingmanager.ParkingManager;
import parkingmanager.TwoWheelerParkingManager;
import parkingstrategy.NearestParkingStrategy;
import parkingstrategy.ParkingStrategy;
import price.PricingStrategy;
import price.TimeBasedPricing;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ParkingStrategy strategy = new NearestParkingStrategy();
        PricingStrategy pricingStrategy = new TimeBasedPricing();

        // Floors
        Floor floor1 = new Floor(1, Map.of(
                VehicleType.TWO_WHEELER,
                new TwoWheelerParkingManager(
                        List.of(
                                new ParkingSlot("F1-T1", VehicleType.TWO_WHEELER),
                                new ParkingSlot("F1-T2", VehicleType.TWO_WHEELER)
                        ), strategy
                ),
                VehicleType.FOUR_WHEELER,
                new FourWheelerParkingManager(
                        List.of(
                                new ParkingSlot("F1-C1", VehicleType.FOUR_WHEELER),
                                new ParkingSlot("F1-C2", VehicleType.FOUR_WHEELER)
                        ), strategy
                )
        ));

        Floor floor2 = new Floor(2, Map.of(
                VehicleType.TWO_WHEELER,
                new TwoWheelerParkingManager(
                        List.of(
                                new ParkingSlot("F2-T1", VehicleType.TWO_WHEELER),
                                new ParkingSlot("F2-T2", VehicleType.TWO_WHEELER)
                        ), strategy
                ),
                VehicleType.FOUR_WHEELER,
                new FourWheelerParkingManager(
                        List.of(
                                new ParkingSlot("F2-C1", VehicleType.FOUR_WHEELER),
                                new ParkingSlot("F2-C2", VehicleType.FOUR_WHEELER)
                        ), strategy
                )
        ));

        Floor floor3 = new Floor(3, Map.of(
                VehicleType.TWO_WHEELER,
                new TwoWheelerParkingManager(
                        List.of(
                                new ParkingSlot("F3-T1", VehicleType.TWO_WHEELER),
                                new ParkingSlot("F3-T2", VehicleType.TWO_WHEELER)
                        ), strategy
                ),
                VehicleType.FOUR_WHEELER,
                new FourWheelerParkingManager(
                        List.of(
                                new ParkingSlot("F3-C1", VehicleType.FOUR_WHEELER),
                                new ParkingSlot("F3-C2", VehicleType.FOUR_WHEELER)
                        ), strategy
                )
        ));

        FloorManager floorManager = new FloorManager(List.of(floor1, floor2, floor3));

        ParkingLot parkingLot = new ParkingLot(floorManager, pricingStrategy);

        EntryGate entryGate = new EntryGate(parkingLot);
        ExitGate exitGate = new ExitGate(parkingLot);

        // Vehicles
        Vehicle v1 = new Vehicle("bike1", VehicleType.TWO_WHEELER);
        Vehicle v2 = new Vehicle("car1", VehicleType.FOUR_WHEELER);
        Vehicle v3 = new Vehicle("car2", VehicleType.FOUR_WHEELER);
        Vehicle v4 = new Vehicle("bike2", VehicleType.TWO_WHEELER);
        Vehicle v5 = new Vehicle("car3", VehicleType.FOUR_WHEELER);
        Vehicle v6 = new Vehicle("car4", VehicleType.FOUR_WHEELER);
        Vehicle v7 = new Vehicle("bike3", VehicleType.TWO_WHEELER);
        Vehicle v8 = new Vehicle("car5", VehicleType.FOUR_WHEELER);
        Vehicle v9 = new Vehicle("car6", VehicleType.FOUR_WHEELER);

        // Entry
        Ticket t1 = entryGate.generateTicket(v1);
        Ticket t2 = entryGate.generateTicket(v2);
        Ticket t3 = entryGate.generateTicket(v3);
        Ticket t4 = entryGate.generateTicket(v4);
        Ticket t5 = entryGate.generateTicket(v5);
        Ticket t6 = entryGate.generateTicket(v6);
        Ticket t7 = entryGate.generateTicket(v7);
        Ticket t8 = entryGate.generateTicket(v8);
        Ticket t9 = entryGate.generateTicket(v9);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        System.out.println(t6);
        System.out.println(t7);
        System.out.println(t8);
        System.out.println(t9);

        Thread.sleep( 70 * 1000);

        // Exit
        exitGate.releaseSlot(t1);
        exitGate.releaseSlot(t2);
        exitGate.releaseSlot(t3);
        exitGate.releaseSlot(t4);
        exitGate.releaseSlot(t5);
        exitGate.releaseSlot(t6);
        exitGate.releaseSlot(t7);
        exitGate.releaseSlot(t8);
        exitGate.releaseSlot(t9);
    }
}