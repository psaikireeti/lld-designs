package parkingLotDesign.model;

import parkingLotDesign.enums.VehicleType;
import parkingLotDesign.parkingmanager.ParkingManager;

import java.util.Map;

public class Floor {

    public int floor;

    public boolean isFloorFull;

    public Map<VehicleType, ParkingManager> managerMap;


    public Floor(int floor, Map<VehicleType, ParkingManager> managerMap) {
        this.floor = floor;
        this.managerMap = managerMap;
    }


    public boolean isFloorFull() {
        return isFloorFull;
    }

    public void setFloorFull(boolean floorFull) {
        isFloorFull = floorFull;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Map<VehicleType, ParkingManager> getManagerMap() {
        return managerMap;
    }

    public void setManagerMap(Map<VehicleType, ParkingManager> managerMap) {
        this.managerMap = managerMap;
    }
}
