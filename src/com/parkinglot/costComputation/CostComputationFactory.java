package src.com.parkinglot.costcomputation;

import src.com.parkinglot.ticket.Ticket;
import src.com.parkinglot.vehicle.Vehicle;

public class CostComputationFactory {

    public static CostComputation getCostComputer(Ticket ticket) {
        Vehicle vehicle = ticket.vehicle;
        
        switch(vehicle.vehicleType) {
            case TWOWHEELER:
                return new TwoWheelerCostComputation();
            case FOURWHEELER:
            default:
                return new FourWheelerCostComputation();
        }

    }
}
