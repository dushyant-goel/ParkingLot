import src.com.parkinglot.ticket.Ticket;

package src.com.parkinglot.pricingstrategy;
public class PricingStrategy {
    
    Integer price(Ticket ticket) {
        return ticket.spot.price;
    }
}
