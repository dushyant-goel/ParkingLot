package src.com.parkinglot.pricingstrategy;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import src.com.parkinglot.ticket.Ticket;

public class HourlyStrategy extends PricingStrategy{

    @Override
    Integer price(Ticket ticket) {
        
        long entryTimeUnix = ticket.entryTime;
        long exitTimeUnix = System.currentTimeMillis();

        LocalDateTime entryTime = convertToDateTime(entryTimeUnix);
        LocalDateTime exitTime = convertToDateTime(exitTimeUnix);

        Duration duration = Duration.between(entryTime, exitTime);
        long hours = duration.toHours();

        return Integer.valueOf((int) hours) + 1;
    }

    private LocalDateTime convertToDateTime(long unix_ts) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(unix_ts), ZoneOffset.UTC);
    }
    
}
