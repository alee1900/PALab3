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
}
