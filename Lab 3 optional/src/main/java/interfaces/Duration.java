package interfaces;

import java.time.LocalTime;

public class Duration {
    private LocalTime duration;

    public Duration(LocalTime openingTime, LocalTime closingTime) {
        int hours = closingTime.getHour() - openingTime.getHour();
        int minutes = closingTime.getMinute() - openingTime.getMinute();

        if (minutes < 0) {
            minutes = minutes + 60;
            hours--;
        }

        this.duration = LocalTime.of(hours, minutes);
    }

    public LocalTime getDuration() {
        return duration;
    }
}