package elevator_design;

import java.util.List;
import java.util.Queue;

public class InternalButton {

    public String elevatorId;

    public Queue<Integer> floorNumbers;

    public InternalButton(String elevatorId, Queue<Integer> floorNumbers) {
        this.elevatorId = elevatorId;
        this.floorNumbers = floorNumbers;
    }

    public Queue<Integer> getFloorNumbers() {
        return floorNumbers;
    }

    public void setFloorNumbers(Queue<Integer> floorNumbers) {
        this.floorNumbers = floorNumbers;
    }

    public String getElevatorId() {
        return elevatorId;
    }

    public void setElevatorId(String elevatorId) {
        this.elevatorId = elevatorId;
    }
}
