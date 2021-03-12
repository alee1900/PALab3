import interfaces.Classifiable;
import interfaces.Payable;
import interfaces.Visitable;

import java.time.LocalTime;
import java.util.HashMap;

/**
 * Class Museum which is a Location
 * It is Visitable, Payable and Classifiable
 */

public class Museum extends Location implements Visitable, Payable, Classifiable, Comparable<Location> {
    private LocalTime openingTime, closingTime;
    private double ticketPrice;
    private int rank;

    /**
     * Constructor with parameters
     * @param name represents the name of the museum
     * @param openingTime represents the opening time of the museum
     * @param closingTime represents the closing time of the museum
     * @param ticketPrice represents the price for the museum
     * @param rank represents the rank for the visiting order
     */

    public Museum(String name, LocalTime openingTime, LocalTime closingTime, double ticketPrice, int rank) {
        super(name, new HashMap<>());
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.ticketPrice = ticketPrice;
        this.rank = rank;
    }

    /**
     * Overridden getter for opening time from Visitable interface
     * @return the opening time for the museum
     */

    @Override
    public LocalTime getOpeningTime() {
        return openingTime;
    }

    /**
     * Setter for opening time from Visitable interface
     * @param openingTime represents the opening time for the museum
     */

    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    /**
     * Overridden getter for closing time from Visitable interface
     * @return the closing time for the museum
     */

    @Override
    public LocalTime getClosingTime() {
        return closingTime;
    }

    /**
     * Setter for closing time from Visitable interface
     * @param closingTime represents the closing time for the museum
     */

    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
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
     * Used for sorting the locations based on opening time
     * @return the opening time in seconds
     */

    @Override
    protected int getTime() {
        return this.openingTime.getHour() * 3600 + this.openingTime.getMinute() * 60;
    }

    /**
     * Overridden method from class Location for printing the visiting duration
     */

    @Override
    public void showVisitingDuration() {
        System.out.println("Museum " + this.getName() + " is open for " + Visitable.getVisitingDuration(this.openingTime, this.closingTime).getDuration());
    }

    /**
     * Overridden method compareTo used to compare opening times of 2 locations
     * @param other represents the second location
     * @return the result of the comparison or -1 if one of the locations is not visitable
     */

    @Override
    public int compareTo(Location other) {
        int time = this.getTime();
        int otherTime = other.getTime();
        if (otherTime != -1) {
            return Integer.compare(time, otherTime);
        } else {
            return -1;
        }
    }
}