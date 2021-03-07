import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public abstract class Location implements Comparable<Location> {
    protected String name;
    protected Map<Location, Integer> cost = new HashMap<>();

    public Location(String name, Map<Location, Integer> cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Location, Integer> getCost() {
        return cost;
    }

    public void setCost(Map<Location, Integer> cost) {
        this.cost = cost;
    }

    public void setCost(Location location, int value) {
        cost.put(location, value);
    }

    public void printCosts() {
        for (Map.Entry<Location, Integer> i : cost.entrySet()) {
            System.out.println("From " + this.getName() + " to " + i.getKey().getName() + " the distance is " + i.getValue());
        }
    }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Objects.equals(name, location.name) && Objects.equals(cost, location.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost);
    }

    @Override
    public int compareTo(Location other) {
        return this.name.compareTo(other.name);
        //not safe, check if name is null before
    }
}
