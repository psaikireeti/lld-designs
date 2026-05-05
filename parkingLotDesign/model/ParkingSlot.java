package parkingLotDesign.model;

import parkingLotDesign.enums.VehicleType;

public class ParkingSlot {
    public String slotId;
    public VehicleType vehicleType;

    public boolean isOccupied;


    public ParkingSlot(String slotId, VehicleType vehicleType) {
        this.slotId = slotId;
        this.vehicleType = vehicleType;
        this.isOccupied = false;
    }


    public String getSlotId() {
        return slotId;
    }

    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
}
