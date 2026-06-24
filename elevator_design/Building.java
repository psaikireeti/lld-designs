package elevator_design;

import elevator_design.ElevatorController;

public class Building {
    public String iD;
    public int totalFloors;

    public ElevatorController elevatorController;


    public Building(int totalFloors, ElevatorController elevatorController) {
        this.iD = Util.generateRandomUUID();
        this.totalFloors = totalFloors;
        this.elevatorController = elevatorController;
    }


















    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public int getTotalFloors() {
        return totalFloors;
    }

    public void setTotalFloors(int totalFloors) {
        this.totalFloors = totalFloors;
    }

    public ElevatorController getElevatorController() {
        return elevatorController;
    }

    public void setElevatorController(ElevatorController elevatorController) {
        this.elevatorController = elevatorController;
    }





}
