package price;

import model.Ticket;

public interface PricingStrategy {
    public double calculateAmount(Ticket ticket);
}
