public class CostComputation {

    public PricingStrategy calculator;

    CostComputation(PricingStrategy calc) {
       this.calculator = calc;
    }

    Integer getPrice(Ticket ticket) {
        return calculator.price(ticket);
    }
}
