import java.util.HashMap;

public class Restaurant extends Location implements Payable, Classifiable {
    private double ticketPrice;
    private int rank;

    public Restaurant(String name, double ticketPrice, int rank) {
        super(name, new HashMap<>());
        this.ticketPrice = ticketPrice;
        this.rank = rank;
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
