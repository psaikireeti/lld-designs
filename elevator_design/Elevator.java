package elevator_design;

import elevator_design.enums.ElevatorDirection;
import elevator_design.enums.ElevatorState;
import elevator_design.strategy.ElevatorStrategy;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Elevator implements Runnable{
    public String iD;
    public int floorNumber;

    public ElevatorState state;

    public ElevatorDirection direction;

    public ElevatorStrategy elevatorStrategy;

    Queue<ElevatorRequest> requests = new LinkedList<>();

    Queue<Integer> requestedFloors = new LinkedList<>();



    public Elevator(String iD, int floorNumber, ElevatorState state, ElevatorDirection direction, ElevatorStrategy elevatorStrategy) {
        this.iD = iD;
        this.floorNumber = floorNumber;
        this.state = state;
        this.direction = direction;
        this.elevatorStrategy = elevatorStrategy;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public ElevatorState getState() {
        return state;
    }

    public void setState(ElevatorState state) {
        this.state = state;
    }

    public ElevatorDirection getDirection() {
        return direction;
    }

    public void setDirection(ElevatorDirection direction) {
        this.direction = direction;
    }

    public Queue<ElevatorRequest> getRequests() {
        return requests;
    }

    public void setRequests(Queue<ElevatorRequest> requests) {
        this.requests = requests;
    }

    public ElevatorStrategy getElevatorStrategy() {
        return elevatorStrategy;
    }

    public void setElevatorStrategy(ElevatorStrategy elevatorStrategy) {
        this.elevatorStrategy = elevatorStrategy;
    }

    public Queue<Integer> getRequestedFloors() {
        return requestedFloors;
    }

    public void setRequestedFloors(Queue<Integer> requestedFloors) {
        this.requestedFloors = requestedFloors;
    }

    @Override
    public void run() {
        while(true){

            if(requests.isEmpty()){
                try {
                    this.setState(ElevatorState.IDLE);
                    this.setDirection(ElevatorDirection.IDLE);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            ElevatorRequest request = requests.peek();

            if(this.getRequestedFloors().isEmpty()) {
                if (request != null) {
                    if (request.internalButton != null) {
                        requestedFloors.addAll(request.getInternalButton().getFloorNumbers());
                    } else if (request.getExternalButton() != null) {
                        requestedFloors.add(request.externalButton.getFloor());
                    }
                }
            }

                int nextFloor = 0;
                try {
                    if(request == null){
                        continue;
                    }
                    nextFloor = elevatorStrategy.decideNextStop(request, this);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                if(this.getFloorNumber() > nextFloor){
                    System.out.println("Elevator at floor "  + this.getiD()+ " : " +this.getFloorNumber());
                    this.setFloorNumber(this.getFloorNumber() - 1);
                    this.setState(ElevatorState.MOVING);
                    this.setDirection(ElevatorDirection.DOWN);
                } else if (this.getFloorNumber() < nextFloor) {
                    System.out.println("Elevator at floor "  + this.getiD()+ " : " +this.getFloorNumber());
                    this.setFloorNumber(this.getFloorNumber() + 1);
                    this.setState(ElevatorState.MOVING);
                    this.setDirection(ElevatorDirection.UP);
                }else {
                    requestedFloors.poll();
                    if(requestedFloors.isEmpty()){
                        requests.poll();
                    }
                    this.setState(ElevatorState.STOP);
                    this.setDirection(ElevatorDirection.IDLE);
                    System.out.println("Stopped at floor " + this.getiD()+ " : " +this.getFloorNumber());
                }

        }
    }
}
