package src.com.parkinglot.costComputation;
import src.com.parkinglot.ticket.Ticket;
import src.com.parkinglot.vehicle.Vehicle;

public class CostComputationFactory {
    CostComputation costComputer;

    CostComputationFactory() {
        costComputer = null;
    }

    public CostComputation getCostComputer(Ticket ticket) {
        Vehicle vehicle = ticket.vehicle;
        
        switch(vehicle.vehicleType) {
            case TWOWHEELER:
                costComputer = new TwoWheelerCostComputation();
                break;
            case FOURWHEELER:
            default:
                costComputer = new FourWheelerCostComputation();
        }

        return costComputer;
    }
}
