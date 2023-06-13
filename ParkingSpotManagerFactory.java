public class ParkingSpotManagerFactory {
    
    ParkingSpotManager manager;
    
    
    ParkingSpotManager getManager(Vehicle vh) {
        switch(vh.vehicleType) {
            case TWOWHEELER:
                return new TwoWheelerParkingManager(null);
            case FOURWHEELER:
                return new FourWheelerParkingManager(null);
            default:
                return new FourWheelerParkingManager(null);
        }
    }
}
