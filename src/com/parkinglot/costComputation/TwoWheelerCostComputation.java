package src.com.parkinglot.costComputation;

import src.com.parkinglot.pricingstrategy.DailyPassStrategy;

public class TwoWheelerCostComputation extends CostComputation{
    
    TwoWheelerCostComputation() {
        super(new DailyPassStrategy());
    }
}
