import java.time.LocalTime;
import java.util.HashMap;

public class Museum extends Location implements Visitable, Payable, Classifiable {
    private LocalTime openingTime, closingTime;
    private double ticketPrice;
    private int rank;

    public Museum(String name, LocalTime openingTime, LocalTime closingTime, double ticketPrice, int rank) {
        super(name, new HashMap<>());
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.ticketPrice = ticketPrice;
        this.rank = rank;
    }

    @Override
    public LocalTime getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    @Override
    public LocalTime getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }

    @Override
    public double getTicketPrice() {
        return ticketPrice;
    }

    @Override
    public void setTicketPrice(int price) {
        this.ticketPrice = price;
    }

    @Override
    public int getRank() {
        return rank;
    }

    @Override
    public void setRank(int rank) {
        this.rank = rank;
    }
}
