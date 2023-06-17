package src.com.parkinglot.costcomputation;

import src.com.parkinglot.pricingstrategy.HourlyStrategy;

public class FourWheelerCostComputation extends CostComputation{
    
    FourWheelerCostComputation() {
        super(new HourlyStrategy());
    }
}
