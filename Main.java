import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        
        // Spots
        ParkingSpot spot6 = new TwoWheelerSpot(6);
        ParkingSpot spot5 = new TwoWheelerSpot(5);
        ParkingSpot spot4 = new TwoWheelerSpot(4) ;
        ParkingSpot spot3 = new FourWheelerSpot(3);
        ParkingSpot spot2 = new FourWheelerSpot(2);
        ParkingSpot spot1 = new FourWheelerSpot(1);
        
        // Entrance and Exit Gates
        List<ParkingSpot> listof4Wspots = new ArrayList<>(Arrays.asList(spot1, spot2, spot3));
        List<ParkingSpot> listof2Wspots = new ArrayList<>(Arrays.asList(spot4, spot5, spot6));
        ParkingSpotManager manager2W = new TwoWheelerParkingManager(listof2Wspots);
        ParkingSpotManager manager4W = new FourWheelerParkingManager(listof4Wspots);
        
        // EntraceGate entrace = new EntraceGate();
        // ExitGate exit = new ExitGate();

        // Vehicles
        Vehicle car1 = new Vehicle(9211, VehicleType.FOURWHEELER);
        Vehicle car2 = new Vehicle(3444, VehicleType.FOURWHEELER);
        Vehicle car3 = new Vehicle(5542, VehicleType.FOURWHEELER);
        Vehicle car4 = new Vehicle(2836, VehicleType.FOURWHEELER);
        Vehicle car5 = new Vehicle(7816, VehicleType.FOURWHEELER);

        Vehicle bike1 = new Vehicle(8852, VehicleType.TWOWHEELER);
        Vehicle bike2 = new Vehicle(1297, VehicleType.TWOWHEELER);

        // Progression of Day

      
    }
}