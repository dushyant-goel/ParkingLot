package src.com.parkinglot.parkingmanager;

import java.util.ArrayList;
import java.util.Arrays;

import src.com.parkinglot.parkingspot.TwoWheelerSpot;

public class TwoWheelerParkingManager extends ParkingManager {

    TwoWheelerParkingManager() {
        spots = new ArrayList<>(Arrays.asList(
                new TwoWheelerSpot(6),
                new TwoWheelerSpot(5),
                new TwoWheelerSpot(4)));
    }

}
