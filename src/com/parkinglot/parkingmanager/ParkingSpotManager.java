package src.com.parkinglot.parkingmanager;
import java.util.ArrayList;
import java.util.List;

import src.com.parkinglot.parkingspot.ParkingSpot;
import src.com.parkinglot.vehicle.Vehicle;

public class ParkingSpotManager {
    
    List<ParkingSpot> spots;

    ParkingSpotManager() {
        spots = new ArrayList<>(null);
    }

    ParkingSpotManager(List<ParkingSpot> spots) {
        this.spots = spots;
    }

    void addParkingSpot(ParkingSpot sp) {
        spots.add(sp);
    }
    
    void removeParkingSpot(ParkingSpot sp) {
        spots.remove(sp);
    }
    
    ParkingSpot findParkingSpot() {
        ParkingSpot emptySpot = null;

        for(ParkingSpot s : spots) {
            if(s.isEmpty) {
                emptySpot = s;
                break;
            }
        }

        return emptySpot;
    }

    void parkVehicle(Vehicle vh, ParkingSpot sp) {
        sp.parkVehicle(vh);
    }

    void unparkVehicle(ParkingSpot sp) {
        sp.unparkVehicle();
    }

}
