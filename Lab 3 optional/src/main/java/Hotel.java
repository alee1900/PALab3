import interfaces.Classifiable;
import interfaces.Payable;

import java.util.HashMap;

/**
 * Class Hotel which is a Location
 * It is Payable and Classifiable
 */

public class Hotel extends Location implements Payable, Classifiable {
    private double ticketPrice;
    private int rank;

    /**
     * Constructor with parameters
     * @param name represents the name of the hotel
     * @param ticketPrice represents the price to stay at the hotel
     * @param rank represents the rank for the visiting order
     */

    public Hotel(String name, double ticketPrice, int rank) {
        super(name, new HashMap<>());
        this.ticketPrice = ticketPrice;
        this.rank = rank;
        this.name = name;
        this.cost = cost;
    }

    /**
     * Overridden getter for ticket price from Payable interface
     * @return the ticket price for the hotel
     */

    @Override
    public double getTicketPrice() {
        return ticketPrice;
    }

    /**
     * Overridden setter for ticket price from Payable interface
     * @param price represents the price for the hotel
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

    @Override
    protected int getTime() {
        return -1;
    }

    @Override
    public void showVisitingDuration() {
        System.out.println("This is not a visitable location, it is a hotel!");
    }
}