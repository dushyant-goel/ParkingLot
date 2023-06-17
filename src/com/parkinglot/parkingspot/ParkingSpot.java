import src.com.parkinglot.vehicle.Vehicle;

package src.com.parkinglot.parkingspot;
public class ParkingSpot {

    Integer id;
    Boolean isEmpty;
    ParkingSpotType spotType;
    int price;

    Vehicle vehicle;
    
    ParkingSpot(Integer id) {
        this.id = id;
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