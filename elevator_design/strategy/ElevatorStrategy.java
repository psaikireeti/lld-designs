package elevator_design.strategy;

import elevator_design.Elevator;
import elevator_design.ElevatorRequest;

public interface ElevatorStrategy {

    public int decideNextStop(ElevatorRequest request, Elevator elevator) throws InterruptedException;
}
