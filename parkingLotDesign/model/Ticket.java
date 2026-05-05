package parkingLotDesign.model;

import parkingLotDesign.enums.TicketStatus;
import parkingLotDesign.enums.VehicleType;

public class Ticket {

    public String ticketId;
    public TicketStatus status;
    public String vehicleNumber;
    public VehicleType vehicleType;
    public int floorNumber;
    public String slotId;

    public long entryTime;
    public long exitTime;


    public Ticket(String ticketId, TicketStatus status, String vehicleNumber, VehicleType vehicleType, int floorNumber, String slotId, long entryTime, long exitTime) {
        this.ticketId = ticketId;
        this.status = status;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.floorNumber = floorNumber;
        this.slotId = slotId;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getSlotId() {
        return slotId;
    }

    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }

    public long getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(long entryTime) {
        this.entryTime = entryTime;
    }

    public long getExitTime() {
        return exitTime;
    }

    public void setExitTime(long exitTime) {
        this.exitTime = exitTime;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId='" + ticketId + '\'' +
                ", status=" + status +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", vehicleType=" + vehicleType +
                ", floorNumber=" + floorNumber +
                ", slotId='" + slotId + '\'' +
                ", entryTime=" + entryTime +
                ", exitTime=" + exitTime +
                '}';
    }
}
