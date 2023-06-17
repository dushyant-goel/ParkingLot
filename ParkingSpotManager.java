import java.util.List;

public class ParkingSpotManager {
    
    List<ParkingSpot> spots;

    ParkingSpotManager(List<ParkingSpot> spots) {
        this.spots = spots;
    }

    
    void addParkingSpot(ParkingSpot sp) {
        spots.add(sp);
    }
    
    void removeParkingSpot(ParkingSpot sp) {
        spots.remove(sp);
    }
    
    ParkingSpot findParkingSpot() {
        ParkingSpot emptySpot = null;

        for(ParkingSpot s : spots) {
            if(s.isEmpty) {
                emptySpot = s;
                break;
            }
        }

        return emptySpot;
    }

    // void parkVehicle(Vehicle vh) {
    //     ParkingSpot sp = findParkingSpot();
    //     sp.parkVehicle(vh);

    // }

    // Vehicle removeVehicle(ParkingSpot sp) {
    //     Vehicle vh = new Vehicle(0333, VehicleType.TWOWHEELER);
    //     return vh;
    // }

}
