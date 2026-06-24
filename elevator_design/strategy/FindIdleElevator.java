package elevator_design.strategy;

import elevator_design.Elevator;
import elevator_design.ElevatorRequest;
import elevator_design.enums.ElevatorState;

import java.util.List;

public class FindIdleElevator implements FindElevatorStrategy{

    @Override
    public Elevator findElevator(List<Elevator> elevators, ElevatorRequest request) {
        if(request.externalButton != null){
            return elevators.stream().filter(e -> e.state.equals(ElevatorState.IDLE)).findFirst().orElse(null);
        }else if (request.internalButton != null){
            return elevators.stream().filter(e -> e.getiD().equals(request.getInternalButton().getElevatorId())).findFirst().orElse(null);
        }
        throw new RuntimeException("Elevators are busy");
    }
}
