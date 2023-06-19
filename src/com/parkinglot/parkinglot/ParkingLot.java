package src.com.parkinglot.parkinglot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import src.com.parkinglot.entranceexit.EntraceGate;
import src.com.parkinglot.entranceexit.ExitGate;
import src.com.parkinglot.parkingspot.FourWheelerSpot;
import src.com.parkinglot.parkingspot.ParkingSpot;
import src.com.parkinglot.parkingspot.TwoWheelerSpot;

public class ParkingLot {

    public EntraceGate entrace;
    public ExitGate exit;
    List<ParkingSpot> parkingSpots;

    public ParkingLot() {
        parkingSpots = new ArrayList<>();
        parkingSpots.addAll(new ArrayList<>(Arrays.asList(new TwoWheelerSpot(6), new TwoWheelerSpot(5), new TwoWheelerSpot(4))));
        parkingSpots.addAll(new ArrayList<>(Arrays.asList(new FourWheelerSpot(1), new FourWheelerSpot(2), new FourWheelerSpot(3))));
        
        
        entrace = new EntraceGate(parkingSpots);
        exit = new ExitGate(parkingSpots);

       //  ParkingManager<ParkingSpot> manager = ParkingManagerFactory.getManager(null, parkingSpots);
        
        // entrace.setManager(manager);
        // exit.setManager(manager);
    }

}
