package src.com.parkinglot.parkingmanager;

import java.util.List;

import src.com.parkinglot.parkingspot.TwoWheelerSpot;

public class TwoWheelerParkingManager extends ParkingManager<TwoWheelerSpot> {

    public TwoWheelerParkingManager(List<TwoWheelerSpot> parkingSpots) {
        super(parkingSpots);
    }

}
