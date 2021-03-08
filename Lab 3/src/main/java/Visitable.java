import java.time.LocalTime;

/**
 * Interface Visitable
 * Implements opening and closing times for certain locations
 */

public interface Visitable {
    LocalTime getOpeningTime();

    void setOpeningTime(LocalTime time);

    LocalTime getClosingTime();

    void setClosingTime(LocalTime time);
}
