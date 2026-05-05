package parkingLotDesign.gate;

import parkingLotDesign.model.Ticket;
import parkingLotDesign.parking.ParkingLot;

public class ExitGate {

    ParkingLot parkingLot;

    public ExitGate(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public void releaseSlot(Ticket ticket) {
        ticket.setExitTime(System.currentTimeMillis());
        parkingLot.releaseSlot(ticket);
    }
}
