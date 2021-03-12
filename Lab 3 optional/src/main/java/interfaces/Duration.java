package interfaces;

import java.time.LocalTime;

/**
 * Class Duration used to get the visiting duration for each visitable location
 */

public class Duration {
    private LocalTime duration;

    /**
     * Constructor with parameters
     * @param openingTime represents the opening time for the location
     * @param closingTime represents the closing time for the location
     */

    public Duration(LocalTime openingTime, LocalTime closingTime) {
        int hours = closingTime.getHour() - openingTime.getHour();
        int minutes = closingTime.getMinute() - openingTime.getMinute();

        if (minutes < 0) {
            minutes = minutes + 60;
            hours--;
        }

        this.duration = LocalTime.of(hours, minutes);
    }

    /**
     * Getter for duration
     * @return the duration in which the location is open, calculated in the constructor
     */

    public LocalTime getDuration() {
        return duration;
    }
}