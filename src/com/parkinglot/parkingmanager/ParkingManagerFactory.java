package src.com.parkinglot.parkingmanager;

import java.util.List;
import java.util.stream.Collectors;

import src.com.parkinglot.parkingspot.FourWheelerSpot;
import src.com.parkinglot.parkingspot.ParkingSpot;
import src.com.parkinglot.parkingspot.TwoWheelerSpot;
import src.com.parkinglot.vehicle.Vehicle;

public class ParkingManagerFactory {
    
    public static ParkingManager<?> getManager(Vehicle vh, List<ParkingSpot> parkingSpots) {
        switch(vh.vehicleType) {
            case TWOWHEELER:
                List<TwoWheelerSpot> twoWheelerSpots = filterTwoWheelerSpots(parkingSpots);
                return new TwoWheelerParkingManager(twoWheelerSpots);
            case FOURWHEELER:
            default:
                List<FourWheelerSpot> fourWheelerSpots = filterFourWheelerSpots(parkingSpots);
                return new FourWheelerParkingManager(fourWheelerSpots);
        }

    }

    private static List<TwoWheelerSpot> filterTwoWheelerSpots(List<ParkingSpot> parkingSpots) {
        return parkingSpots.stream()
            .filter(s -> s instanceof TwoWheelerSpot)
            .map(s -> (TwoWheelerSpot) s)
            .collect(Collectors.toList());
    }

    private static List<FourWheelerSpot> filterFourWheelerSpots(List<ParkingSpot> parkingSpots) {
        return parkingSpots.stream()
            .filter(s -> s instanceof FourWheelerSpot)
            .map(s -> (FourWheelerSpot) s)
            .collect(Collectors.toList());
    }
}
