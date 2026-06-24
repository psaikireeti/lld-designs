package elevator_design.strategy;

import elevator_design.Elevator;
import elevator_design.ElevatorRequest;

public class FCFSStrategy implements ElevatorStrategy{
    @Override
    public int decideNextStop(ElevatorRequest request, Elevator elevator) throws InterruptedException {

       return elevator.getRequestedFloors().peek();

    }
}
