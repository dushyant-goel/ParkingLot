import src.com.parkinglot.costComputation.CostComputationFactory;
import src.com.parkinglot.parkingspot.ParkingSpot;
import src.com.parkinglot.parkingspot.ParkingSpotManager;
import src.com.parkinglot.parkingspot.ParkingSpotManagerFactory;
import src.com.parkinglot.ticket.Ticket;
import src.com.parkinglot.vehicle.Vehicle;

public class ExitGate {

    Ticket ticket;
    CostComputation costComputer;
    ParkingSpotManager manager;
    
    Integer calculateCost(Ticket ticket) {
        costComputer = new CostComputationFactory().getCostComputer(ticket);
        return costComputer.getPrice(ticket);
    }

    void collectPayment(Integer cost) {
        // cash, card, UPI
    }

    void updateParkingSpot(Ticket ticket) {
        Vehicle vh = ticket.vehicle;
        ParkingSpot spot = ticket.spot;
        
        manager = new ParkingSpotManagerFactory().getManager(vh);
        manager.unparkVehicle(spot);
    }
}
