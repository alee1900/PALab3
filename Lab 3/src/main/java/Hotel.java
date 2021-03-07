import java.util.HashMap;
import java.util.Map;

public class Hotel extends Location implements Payable, Classifiable {
    private double ticketPrice;
    private int rank;

    public Hotel(String name, double ticketPrice, int rank) {
        super(name, new HashMap<>());
        this.ticketPrice = ticketPrice;
        this.rank = rank;
        this.name = name;
        this.cost = cost;
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
