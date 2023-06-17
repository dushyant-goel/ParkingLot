package src.com.parkinglot.costComputation;

import src.com.parkinglot.pricingstrategy.HourlyStrategy;

public class FourWheelerCostComputation extends CostComputation{
    
    FourWheelerCostComputation() {
        super(new HourlyStrategy());
    }
}
