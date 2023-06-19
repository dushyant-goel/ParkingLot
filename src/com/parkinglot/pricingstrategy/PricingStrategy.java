package src.com.parkinglot.pricingstrategy;

import src.com.parkinglot.ticket.Ticket;

public abstract class PricingStrategy {
    
    public Integer price(Ticket ticket) {
        return ticket.spot.price;
    }
}
