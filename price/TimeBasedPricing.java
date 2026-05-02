package price;

import model.Ticket;

public class TimeBasedPricing implements PricingStrategy{

    @Override
    public double calculateAmount(Ticket ticket) {
        double totalParkTimeInMin = (double) (ticket.getExitTime() - ticket.getEntryTime()) / 60000.0;
        double amount = (double) totalParkTimeInMin * 10;

        return (double) Math.round(amount * 100.0) /100.0;
    }
}
