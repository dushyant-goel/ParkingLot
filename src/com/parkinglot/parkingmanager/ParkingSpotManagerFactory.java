package src.com.parkinglot.parkingmanager;

import src.com.parkinglot.vehicle.Vehicle;

public class ParkingSpotManagerFactory {
    
    ParkingSpotManager manager;

    public ParkingSpotManagerFactory() {
        manager = new ParkingSpotManager(null);
    }

    public ParkingSpotManager getManager(Vehicle vh) {
        switch(vh.vehicleType) {
            case TWOWHEELER:
                manager = new TwoWheelerParkingManager();
                break;
            case FOURWHEELER:
            default:
                manager = new FourWheelerParkingManager();
                break;
        }

        return manager;
    }
}
