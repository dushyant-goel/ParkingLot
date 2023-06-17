package src.com.parkinglot.parkingmanager;

import java.util.ArrayList;
import java.util.Arrays;

import src.com.parkinglot.parkingspot.TwoWheelerSpot;

public class FourWheelerParkingManager extends ParkingSpotManager {

    FourWheelerParkingManager() {
        spots = new ArrayList<>(Arrays.asList(
                new TwoWheelerSpot(1),
                new TwoWheelerSpot(2),
                new TwoWheelerSpot(3)
        ));
    }
    
}
