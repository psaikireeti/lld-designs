package gate;

import Utils.Util;
import enums.TicketStatus;
import model.ParkingSlot;
import model.Ticket;
import model.Vehicle;
import parking.ParkingLot;

public class EntryGate {

    ParkingLot parkingLot;

    public EntryGate(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public Ticket generateTicket(Vehicle vehicle) {

        return parkingLot.parkVehicle(vehicle);
    }

}
