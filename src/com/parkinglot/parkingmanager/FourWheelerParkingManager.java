package src.com.parkinglot.parkingmanager;

import java.util.ArrayList;
import java.util.Arrays;

import src.com.parkinglot.parkingspot.FourWheelerSpot;
import src.com.parkinglot.parkingspot.FourWheelerSpot;

public class FourWheelerParkingManager extends ParkingManager {

    FourWheelerParkingManager() {
        spots = new ArrayList<>(Arrays.asList(
                new FourWheelerSpot(1),
                new FourWheelerSpot(2),
                new FourWheelerSpot(3)
        ));
    }
    
}
