import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Class TravelPlan
 */

public class TravelPlan {
    private City city;
    private List<Location> locations;
    private Map<Location, Integer> preferences;

    /**
     * Constructor with no parameters
     */

    public TravelPlan() {
        this.city = new City();
        this.locations = new LinkedList<>();
        this.preferences = new HashMap<>();
    }

    /**
     * Constructor with parameters
     * @param city represents the city
     * @param locations represents the locations in the city
     * @param preferences represents the preferences for the visiting order
     */

    public TravelPlan(City city, List<Location> locations, Map<Location, Integer> preferences) {
        this.city = city;
        this.locations = new LinkedList<>(locations);
        this.preferences = new HashMap<>(preferences);
    }

    /**
     * Constructor with parameters
     * @param city represents the city
     * @param preferences represents the preferences for the visiting order
     */

    public TravelPlan(City city, Map<Location, Integer> preferences) {
        this.city = city;
        this.locations = new LinkedList<>();
        this.locations = city.getLocations();
        this.preferences = new HashMap<>(preferences);
    }

    /**
     * Constructor with one parameter
     * @param city represents the city
     */

    public TravelPlan(City city) {
        this.city = city;
        this.locations = new LinkedList<>();
        this.preferences = new HashMap<>();
    }

    /**
     * Getter for city
     * @return the city
     */

    public City getCity() {
        return city;
    }

    /**
     * Setter for city
     * @param city represents the city to be set
     */

    public void setCity(City city) {
        this.city = city;
    }

    /**
     * Getter for locations
     * @return the location list
     */

    public List<Location> getLocations() {
        return locations;
    }

    /**
     * Setter for locations
     * @param locations represents the location list to be set
     */

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    /**
     * Getter for preferences
     * @return the preferences for the visiting order
     */

    public Map<Location, Integer> getPreferences() {
        return preferences;
    }

    /**
     * Setter for preferences
     * @param preferences represents the preferences for the visiting order
     */

    public void setPreferences(Map<Location, Integer> preferences) {
        this.preferences = preferences;
    }
}
