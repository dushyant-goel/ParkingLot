public class EntraceGate {
    
    ParkingSpotManager manager;

    EntraceGate() {
        
    }
    
    ParkingSpot findParkingSpot(Vehicle vh){
        this.manager = new ParkingSpotManagerFactory().getManager(vh);
        ParkingSpot spot = manager.findParkingSpot();
        return spot;
    }
    
    void updateParkingSpot(Vehicle vh, ParkingSpot spot) {
        manager.parkVehicle(vh, spot);
    }

    Ticket generateTicket(Vehicle vh, ParkingSpot spot) {
        Ticket ticket = new Ticket(vh, spot);
        return ticket;
    }
}
