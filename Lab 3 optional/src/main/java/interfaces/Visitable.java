package interfaces;

import java.time.LocalTime;

/**
 * Interface Visitable
 * Implements opening and closing times for certain locations
 */

public interface Visitable {
    /**
     * Getter for opening time
     * @return the opening time for the location
     */

    LocalTime getOpeningTime();

    /**
     * Default setter for opening time
     * Sets the opening time to 9:30
     */

    default void setOpeningTime() {
        LocalTime openingTime = LocalTime.of(9, 30);
    }

    /**
     * Getter for closing time
     * @return the closing time for the location
     */

    LocalTime getClosingTime();

    /**
     * Default setter for closing time
     * Sets the closing time to 20:00
     */

    default void setClosingTime() {
        LocalTime closingTime = LocalTime.of(20, 0);
    }

    /**
     * Static getter for visiting duration
     * @param openingTime represents the opening time for the location
     * @param closingTime represents the closing time for the location
     * @return the duration in which the location is open for visiting
     */

    static Duration getVisitingDuration(LocalTime openingTime, LocalTime closingTime) {
        Duration time = new Duration(openingTime, closingTime);
        return time;
    }
}