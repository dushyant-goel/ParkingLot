package src.com.parkinglot.entranceexit;

import java.util.List;

import src.com.parkinglot.parkingspot.ParkingSpot;
import src.com.parkinglot.parkingmanager.ParkingManager;
import src.com.parkinglot.parkingmanager.ParkingManagerFactory;
import src.com.parkinglot.ticket.Ticket;
import src.com.parkinglot.vehicle.Vehicle;

public class EntraceGate {
    
    List<ParkingSpot> parkingSpots;
    ParkingManager<?> manager;

    public EntraceGate(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }
    
    // public void setManager(ParkingManager manager) {
    //     this.manager = manager;
    // }
    
    public ParkingSpot findParkingSpot(Vehicle vh) {
        manager = ParkingManagerFactory.getManager(vh, parkingSpots);
        ParkingSpot spot = manager.findParkingSpot();
        return spot;
    }
    
    public  Ticket generateTicket(Vehicle vh, ParkingSpot spot) {
        Ticket ticket = new Ticket(vh, spot);
        return ticket;
    }
    
    public void updateParkingSpot(Ticket ticket) {
        Vehicle vh = ticket.vehicle;
        ParkingSpot spot = ticket.spot;
        
        manager = ParkingManagerFactory.getManager(vh, parkingSpots);
        manager.parkVehicle(vh, spot);
    }
}
