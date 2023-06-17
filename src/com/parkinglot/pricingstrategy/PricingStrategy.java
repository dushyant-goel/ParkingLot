package src.com.parkinglot.pricingstrategy;

import src.com.parkinglot.ticket.Ticket;

public class PricingStrategy {
    
    public Integer price(Ticket ticket) {
        return ticket.spot.price;
    }
}
