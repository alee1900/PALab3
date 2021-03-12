import interfaces.Classifiable;
import interfaces.Payable;

import java.util.HashMap;

/**
 * Class Restaurant which is a Location
 * It is Payable and Classifiable
 */

public class Restaurant extends Location implements Payable, Classifiable {
    private double ticketPrice;
    private int rank;

    /**
     * Constructor with parameters
     * @param name represents the name of the restaurant
     * @param ticketPrice represents the price to eat at the restaurant
     * @param rank represents the rank for the visiting order
     */

    public Restaurant(String name, double ticketPrice, int rank) {
        super(name, new HashMap<>());
        this.ticketPrice = ticketPrice;
        this.rank = rank;
    }

    /**
     * Overridden getter for ticket price from Payable interface
     * @return the ticket price for the museum
     */

    @Override
    public double getTicketPrice() {
        return ticketPrice;
    }

    /**
     * Overridden setter for ticket price from Payable interface
     * @param price represents the price for the museum
     */

    @Override
    public void setTicketPrice(int price) {
        this.ticketPrice = price;
    }

    /**
     * Overridden getter for rank from Classifiable interface
     * @return the rank for the visiting order
     */

    @Override
    public int getRank() {
        return rank;
    }

    /**
     * Overridden setter for rank from Classifiable interface
     * @param rank represents the rank for the visiting order
     */

    @Override
    public void setRank(int rank) {
        this.rank = rank;
    }

    /**
     * Overridden method from class Location for calculating the opening time in seconds
     * @return -1, because a hotel is not a visitable location and does not have opening and closing times
     */

    @Override
    protected int getTime() {
        return -1;
    }

    /**
     * Overridden method from class Location for printing the visiting duration
     * In this case, it prints that this is not a visitable location
     */

    @Override
    public void showVisitingDuration() {
        System.out.println("This is not a visitable location, it is a restaurant!");
    }
}