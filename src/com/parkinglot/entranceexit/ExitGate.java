package src.com.parkinglot.entranceexit;

import java.util.List;

import src.com.parkinglot.costcomputation.CostComputation;
import src.com.parkinglot.costcomputation.CostComputationFactory;
import src.com.parkinglot.parkingspot.ParkingSpot;
import src.com.parkinglot.parkingmanager.ParkingManager;
import src.com.parkinglot.parkingmanager.ParkingManagerFactory;
import src.com.parkinglot.ticket.Ticket;
import src.com.parkinglot.vehicle.Vehicle;

public class ExitGate {

    Ticket ticket;
    CostComputation costComputer;
    List<ParkingSpot> parkingSpots;
    ParkingManager<?> manager;

    
    public ExitGate(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }
    
    // public void setManager(ParkingManager manager) {
    //     this.manager = manager;
    // }
    
    public Integer calculateCost(Ticket ticket) {
        costComputer = CostComputationFactory.getCostComputer(ticket);
        return costComputer.getPrice(ticket);
    }

    public void collectPayment(Integer cost) {
        // cash, card, UPI
    }

    public void updateParkingSpot(Ticket ticket) {
        Vehicle vh = ticket.vehicle;
        ParkingSpot spot = ticket.spot;
        manager = ParkingManagerFactory.getManager(vh, parkingSpots);
        manager.unparkVehicle(spot);
    }
}
