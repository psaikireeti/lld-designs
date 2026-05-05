package parkingLotDesign.floor;

import parkingLotDesign.model.Floor;

import java.util.List;

public class FloorManager {

    public List<Floor> floors;

    public FloorManager(List<Floor> floors) {
        this.floors = floors;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }
}
