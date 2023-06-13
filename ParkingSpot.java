public class ParkingSpot {

    Integer id;
    Boolean isEmpty;

    Vehicle vehicle;
    
    ParkingSpot() {
        this.isEmpty = true;
    }
    
    public void parkVehicle(Vehicle vh) {
        this.vehicle = vh;
        this.isEmpty = false;
    }
    
    public void unparkVehicle() {
        this.vehicle = null;
        this.isEmpty = true;
    }
    
}