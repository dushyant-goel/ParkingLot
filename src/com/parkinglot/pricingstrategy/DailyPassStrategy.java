package src.com.parkinglot.pricingstrategy;

import src.com.parkinglot.ticket.Ticket;

public class DailyPassStrategy extends PricingStrategy{

    @Override
    public Integer price(Ticket ticket) {
        
        return Integer.valueOf(0);
    }


    
}
