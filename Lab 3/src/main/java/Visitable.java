import java.time.LocalTime;

public interface Visitable {
    LocalTime getOpeningTime();

    void setOpeningTime(LocalTime time);

    LocalTime getClosingTime();

    void setClosingTime(LocalTime time);
}
