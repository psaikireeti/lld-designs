package elevator_design;

public class Floor {
    public String iD;

    public int floorNumber;

    public Floor(int floorNumber) {
        this.iD = Util.generateRandomUUID();
        this.floorNumber = floorNumber;
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
}
