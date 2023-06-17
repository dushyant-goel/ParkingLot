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
