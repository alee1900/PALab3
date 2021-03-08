import java.time.LocalTime;
import java.util.HashMap;

/**
 * Class Church which is a Location
 * It is Visitable and Classifiable
 */

public class Church extends Location implements Visitable, Classifiable {
    private LocalTime openingTime, closingTime;
    private int rank;

    /**
     * Constructor with parameters
     * @param name represents the name of the church
     * @param openingTime represents the opening time for the church
     * @param closingTime represents the closing time for the church
     * @param rank represents the rank for the visiting order
     */

    public Church(String name, LocalTime openingTime, LocalTime closingTime, int rank) {
        super(name, new HashMap<>());
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.rank = rank;
    }

    /**
     * Overridden getter for opening time from Visitable interface
     * @return the opening time for the church
     */

    @Override
    public LocalTime getOpeningTime() {
        return openingTime;
    }

    /**
     * Overridden setter for opening time from Visitable interface
     * @param openingTime represents the opening time for the museum
     */

    @Override
    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    /**
     * Overridden getter for closing time from Visitable interface
     * @return the closing time for the church
     */

    @Override
    public LocalTime getClosingTime() {
        return closingTime;
    }

    /**
     * Overridden setter for closing time from Visitable interface
     * @param closingTime represents the closing time for the church
     */

    @Override
    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
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
