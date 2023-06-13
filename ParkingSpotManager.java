import java.util.List;

public class ParkingSpotManager {
    
    List<ParkingSpot> spots;

    ParkingSpotManager(List<ParkingSpot> spots) {
        this.spots = spots;
    }

    ParkingSpot findParkingSpot() {
        ParkingSpot s = new ParkingSpot();
        return s;
    }

    void addParkingSpot(ParkingSpot sp) {
        spots.add(sp);
    }

    void removeParkingSpot(ParkingSpot sp) {
        spots.remove(sp);
    }

    void parkVehicle(Vehicle vh) {
        ParkingSpot sp = findParkingSpot();
        sp.parkVehicle(vh);

    }

    Vehicle removeVehicle(ParkingSpot sp) {
        Vehicle vh = new Vehicle();
        return vh;
    }

}
