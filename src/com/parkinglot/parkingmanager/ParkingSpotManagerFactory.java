package src.com.parkinglot.parkingmanager;
import src.com.parkinglot.vehicle.Vehicle;

public class ParkingSpotManagerFactory {
    
    ParkingSpotManager manager;

    ParkingSpotManager getManager(Vehicle vh) {
        switch(vh.vehicleType) {
            case TWOWHEELER:
                return new TwoWheelerParkingManager();
            case FOURWHEELER:
                return new FourWheelerParkingManager();
            default:
                return new FourWheelerParkingManager();
        }
    }
}
