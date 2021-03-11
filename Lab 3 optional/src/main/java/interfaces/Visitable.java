package interfaces;

import java.time.LocalTime;

/**
 * Interface Visitable
 * Implements opening and closing times for certain locations
 */

public interface Visitable {
    LocalTime getOpeningTime();

    default void setOpeningTime(LocalTime time) {
        LocalTime openingTime = LocalTime.of(9, 30);
    }

    LocalTime getClosingTime();

    default void setClosingTime(LocalTime time) {
        LocalTime closingTime = LocalTime.of(20, 0);
    }

    static Duration getVisitingDuration(LocalTime openingTime, LocalTime closingTime) {
        Duration time = new Duration(openingTime, closingTime);
        return time;
    }
}