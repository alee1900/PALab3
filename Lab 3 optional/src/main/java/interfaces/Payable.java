package interfaces;

/**
 * Interface Payable
 * Implements ticket price for certain locations
 */

public interface Payable {
    double getTicketPrice();

    void setTicketPrice(int price);
}