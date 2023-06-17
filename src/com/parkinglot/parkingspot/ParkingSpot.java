package src.com.parkinglot.parkingspot;

import src.com.parkinglot.vehicle.Vehicle;

public class ParkingSpot {

    Integer id;
    ParkingSpotType spotType;
    public Boolean isEmpty;
    public int price;

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