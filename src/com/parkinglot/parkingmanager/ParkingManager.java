package src.com.parkinglot.parkingmanager;

import java.util.ArrayList;
import java.util.List;

import src.com.parkinglot.parkingspot.ParkingSpot;
import src.com.parkinglot.vehicle.Vehicle;

public abstract class ParkingManager<T extends ParkingSpot> {
    
    protected List<T> parkingSpots;

    ParkingManager() {
        parkingSpots = new ArrayList<>();
    }

    ParkingManager(List<T> spots) {
        this.parkingSpots = spots;
    }

    void addParkingSpot(T sp) {
        parkingSpots.add(sp);
    }
    
    void removeParkingSpot(T sp) {
        parkingSpots.remove(sp);
    }
    
    public ParkingSpot findParkingSpot() {
        ParkingSpot emptySpot = null;

        for(ParkingSpot s : parkingSpots) {
            if(s.isEmpty) {
                emptySpot = s;
                break;
            }
        }

        return emptySpot;
    }

    public void parkVehicle(Vehicle vh, ParkingSpot sp) {
        sp.parkVehicle(vh);
    }

    public void unparkVehicle(ParkingSpot sp) {
        sp.unparkVehicle();
    }

}
