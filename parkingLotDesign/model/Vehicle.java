package parkingLotDesign.model;

import parkingLotDesign.enums.VehicleType;

public class Vehicle {
    public String vehicleNumber;

    public VehicleType vehicleType;


    public Vehicle(String vehicleId, VehicleType vehicleType) {
        vehicleNumber = vehicleId;
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleId(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
