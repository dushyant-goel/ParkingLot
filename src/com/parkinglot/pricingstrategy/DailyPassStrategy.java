import src.com.parkinglot.ticket.Ticket;

package src.com.parkinglot.pricingstrategy;
public class DailyPassStrategy extends PricingStrategy{

    @Override
    Integer price(Ticket ticket) {
        
        return Integer.valueOf(0);
    }


    
}
