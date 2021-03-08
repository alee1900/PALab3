import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * Class City that contains a list of all available locations
 */

public class City {
    private List<Location> locations;

    /**
     * Constructor with no parameters
     */

    public City() {
        this.locations = new LinkedList<>();
    }

    /**
     * Contructor with parameter
     * @param locations represents the list of locations in the city
     */

    public City(List<Location> locations) {
        this.locations = locations;
    }

    /**
     * Getter for locations
     * @return the locations available in the city
     */

    public List<Location> getLocations() {
        return locations;
    }

    /**
     * Setter for locations
     * @param locations represents the list of locations in the city
     */

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    /**
     * Method to add a location in the city
     * @param location represents the location to be added
     */

    public void addLocation(Location location) {
        locations.add(location);
    }

    @Override
    public String toString() {
        return "City{" +
                "locations=" + locations +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(locations, city.locations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locations);
    }
}
