package parkingLotDesign.price;

import parkingLotDesign.model.Ticket;

public interface PricingStrategy {
    public double calculateAmount(Ticket ticket);
}
