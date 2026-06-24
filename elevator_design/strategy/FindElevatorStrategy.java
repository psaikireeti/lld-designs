package elevator_design.strategy;

import elevator_design.Elevator;
import elevator_design.ElevatorRequest;

import java.util.List;

public interface FindElevatorStrategy {
    public Elevator findElevator(List<Elevator> elevators, ElevatorRequest request);
}
