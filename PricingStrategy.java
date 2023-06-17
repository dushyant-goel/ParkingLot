public class PricingStrategy {
    
    Integer price(Ticket ticket) {
        return ticket.spot.price;
    }
}
