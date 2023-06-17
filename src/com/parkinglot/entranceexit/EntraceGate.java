import src.com.parkinglot.parkingspot.ParkingSpot;
import src.com.parkinglot.parkingspot.ParkingSpotManager;
import src.com.parkinglot.parkingspot.ParkingSpotManagerFactory;
import src.com.parkinglot.ticket.Ticket;
import src.com.parkinglot.vehicle.Vehicle;

package src.com.parkinglot.entranceexit;
public class EntraceGate {
    
    ParkingSpotManager manager;

    EntraceGate() {
        
    }
    
    ParkingSpot findParkingSpot(Vehicle vh){
        this.manager = new ParkingSpotManagerFactory().getManager(vh);
        ParkingSpot spot = manager.findParkingSpot();
        return spot;
    }
    
    Ticket generateTicket(Vehicle vh, ParkingSpot spot) {
        Ticket ticket = new Ticket(vh, spot);
        return ticket;
    }
    
    void updateParkingSpot(Ticket ticket) {
        Vehicle vh = ticket.vehicle;
        ParkingSpot spot = ticket.spot;
        manager.parkVehicle(vh, spot);
    }
}
