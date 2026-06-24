package elevator_design;

import elevator_design.enums.ElevatorDirection;

import java.util.List;

public class ExternalButton {

    public int floor;
    public List<ElevatorDirection> direction;

    public ExternalButton(int floor, List<ElevatorDirection> direction) {
        this.floor = floor;
        this.direction = direction;
    }

    public List<ElevatorDirection> getDirection() {
        return direction;
    }

    public void setDirection(List<ElevatorDirection> direction) {
        this.direction = direction;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
