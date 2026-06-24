package elevator_design;

import elevator_design.enums.ElevatorDirection;
import elevator_design.enums.ElevatorState;
import elevator_design.strategy.ElevatorStrategy;
import elevator_design.strategy.FCFSStrategy;
import elevator_design.strategy.FindElevatorStrategy;
import elevator_design.strategy.FindIdleElevator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        List<Floor> floors = List.of(new elevator_design.Floor(0), new elevator_design.Floor(1), new elevator_design.Floor(2),new elevator_design.Floor(3));

        ElevatorStrategy elevatorStrategy = new FCFSStrategy();
        List<Elevator> elevators = List.of(new Elevator("E1", 0, ElevatorState.IDLE, ElevatorDirection.IDLE, elevatorStrategy), new Elevator("E2", 0, ElevatorState.IDLE, ElevatorDirection.IDLE, elevatorStrategy), new Elevator("E3", 0, ElevatorState.IDLE, ElevatorDirection.IDLE, elevatorStrategy));

        FindElevatorStrategy findElevatorStrategy = new FindIdleElevator();

        ElevatorController elevatorController = new ElevatorController(floors, elevators, findElevatorStrategy);
        //Building building = new Building(3, elevatorController);


        ExternalButton externalButton = new ExternalButton(1, List.of(ElevatorDirection.UP, ElevatorDirection.DOWN));
        ExternalButton externalButton2 = new ExternalButton(3, List.of(ElevatorDirection.UP, ElevatorDirection.DOWN));

        InternalButton internalButton = new InternalButton("E2", new LinkedList<>(List.of(5, 6, 7)));

        ElevatorRequest elevatorRequest = new ElevatorRequest( null, externalButton);
        ElevatorRequest elevatorRequest2 = new ElevatorRequest( null, externalButton2);
        ElevatorRequest elevatorRequest3 = new ElevatorRequest( internalButton, null);


        elevators.forEach(elevator -> new Thread(elevator).start());

        elevatorController.assignElevator(elevatorRequest);
        elevatorController.assignElevator(elevatorRequest2);
        elevatorController.assignElevator(elevatorRequest3);
    }
}
