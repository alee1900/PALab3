package interfaces;

/**
 * Interface Payable
 * Implements ticket price for certain locations
 */

public interface Payable {
    /**
     * Getter for ticket price
     * @return the price for a ticket
     */

    double getTicketPrice();

    /**
     * Setter for ticket price
     * @param price represents the price to be set
     */

    void setTicketPrice(int price);
}