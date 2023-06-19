package src.com.parkinglot.parkingmanager;

import java.util.List;

import src.com.parkinglot.parkingspot.FourWheelerSpot;

public class FourWheelerParkingManager extends ParkingManager<FourWheelerSpot> {

    FourWheelerParkingManager(List<FourWheelerSpot> parkingSpots) {
        super(parkingSpots);
    }
    
}
