package elevator_design;

import elevator_design.enums.ElevatorState;
import elevator_design.strategy.FindElevatorStrategy;

import java.util.List;

public class ElevatorController {

    public List<Floor> floors;

    public List<Elevator> elevators;

    public FindElevatorStrategy findElevatorStrategy;


    public ElevatorController(List<Floor> floors, List<Elevator> elevators, FindElevatorStrategy findElevatorStrategy) {
        this.floors = floors;
        this.elevators = elevators;
        this.findElevatorStrategy = findElevatorStrategy;
    }

    public void assignElevator(ElevatorRequest request) throws InterruptedException {
        Elevator elevator = findElevatorStrategy.findElevator(elevators, request);
        if(elevator == null){
            System.out.println("No Idle elevators found");
            return;
        }
        elevator.setState(ElevatorState.MOVING);
        elevator.getRequests().add(request);
    }



    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public List<Elevator> getElevators() {
        return elevators;
    }

    public void setElevators(List<Elevator> elevators) {
        this.elevators = elevators;
    }

}
