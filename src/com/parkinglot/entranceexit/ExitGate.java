package src.com.parkinglot.entranceexit;

import src.com.parkinglot.costcomputation.CostComputation;
import src.com.parkinglot.costcomputation.CostComputationFactory;
import src.com.parkinglot.parkingspot.ParkingSpot;
import src.com.parkinglot.parkingmanager.ParkingSpotManager;
import src.com.parkinglot.parkingmanager.ParkingSpotManagerFactory;
import src.com.parkinglot.ticket.Ticket;
import src.com.parkinglot.vehicle.Vehicle;

public class ExitGate {

    Ticket ticket;
    CostComputation costComputer;
    ParkingSpotManager manager;

    public ExitGate() {

    }
    
    public Integer calculateCost(Ticket ticket) {
        costComputer = new CostComputationFactory().getCostComputer(ticket);
        return costComputer.getPrice(ticket);
    }

    public void collectPayment(Integer cost) {
        // cash, card, UPI
    }

    public void updateParkingSpot(Ticket ticket) {
        Vehicle vh = ticket.vehicle;
        ParkingSpot spot = ticket.spot;
        
        manager = new ParkingSpotManagerFactory().getManager(vh);
        manager.unparkVehicle(spot);
    }
}
