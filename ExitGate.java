public class ExitGate {

    Ticket ticket;
    CostComputation costComputer;
    ParkingSpotManager manager;
    
    Integer calculateCost(Ticket ticket) {
        costComputer = new CostComputationFactory().getCostComputer(ticket);
        return costComputer.getPrice(ticket);
    }

    void collectPayment() {
        // cash, card, UPI
    }

    void updateParkingSpot(Ticket ticket) {
        Vehicle vh = ticket.vehicle;
        ParkingSpot spot = ticket.spot;
        
        manager = new ParkingSpotManagerFactory().getManager(vh);
        manager.unparkVehicle(spot);
    }
}
