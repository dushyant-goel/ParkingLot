package src.com.parkinglot.costcomputation;

import src.com.parkinglot.ticket.Ticket;
import src.com.parkinglot.pricingstrategy.PricingStrategy;
;

public abstract class CostComputation {

    public PricingStrategy calculator;

    CostComputation(PricingStrategy calc) {
       this.calculator = calc;
    }

    public Integer getPrice(Ticket ticket) {
        return calculator.price(ticket);
    }
}
