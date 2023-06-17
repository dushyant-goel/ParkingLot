package src.com.parkinglot.entranceexit;

import src.com.parkinglot.parkingspot.ParkingSpot;
import src.com.parkinglot.parkingmanager.ParkingSpotManager;
import src.com.parkinglot.parkingmanager.ParkingSpotManagerFactory;
import src.com.parkinglot.ticket.Ticket;
import src.com.parkinglot.vehicle.Vehicle;

public class EntraceGate {
    
    ParkingSpotManager manager;

    public EntraceGate() {
        
    }
    
    public ParkingSpot findParkingSpot(Vehicle vh){
        this.manager = new ParkingSpotManagerFactory().getManager(vh);
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
        manager.parkVehicle(vh, spot);
    }
}
