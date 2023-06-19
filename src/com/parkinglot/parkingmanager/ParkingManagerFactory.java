package src.com.parkinglot.parkingmanager;

import src.com.parkinglot.vehicle.Vehicle;

public class ParkingManagerFactory {
    
    public static ParkingManager getManager(Vehicle vh) {
        switch(vh.vehicleType) {
            case TWOWHEELER:
                return new TwoWheelerParkingManager();
            case FOURWHEELER:
            default:
                return new FourWheelerParkingManager();
        }

    }
}
