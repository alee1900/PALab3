import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Abstract class Location
 * Inherited by all possible locations in the city (hotel, museum, church, restaurant)
 */

public abstract class Location implements Comparable<Location> {
    protected String name;
    protected Map<Location, Integer> cost = new HashMap<>();

    /**
     * Constructor with parameters
     * @param name represents the name of the location
     * @param cost represents the cost to reach another location as an integer
     */

    public Location(String name, Map<Location, Integer> cost) {
        this.name = name;
        this.cost = cost;
    }

    /**
     * Getter for name
     * @return the name of the location
     */

    public String getName() {
        return name;
    }

    /**
     * Setter for name
     * @param name represents the name of the location
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for cost
     * @return the cost to reach another location
     */

    public Map<Location, Integer> getCost() {
        return cost;
    }

    /**
     * Setter for cost
     * @param cost represents the cost to reach another location, given as a map with location and value
     */

    public void setCost(Map<Location, Integer> cost) {
        this.cost = cost;
    }

    /**
     * Setter for cost
     * @param location represents the location to be reached
     * @param value represents the value of the cost
     */

    public void setCost(Location location, int value) {
        cost.put(location, value);
    }

    /**
     * Method for printing all costs of a certain location
     */

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
