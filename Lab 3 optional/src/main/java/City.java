import interfaces.Payable;
import interfaces.Visitable;

import java.util.*;

/**
 * Class City that contains a list of all available locations
 */

public class City implements Comparable<Location> {
    private List<Location> locations;

    /**
     * Constructor with no parameters
     */

    public City() {
        this.locations = new LinkedList<>();
    }

    /**
     * Contructor with parameter
     *
     * @param locations represents the list of locations in the city
     */

    public City(List<Location> locations) {
        this.locations = locations;
    }

    /**
     * Getter for locations
     *
     * @return the locations available in the city
     */

    public List<Location> getLocations() {
        return locations;
    }

    /**
     * Setter for locations
     *
     * @param locations represents the list of locations in the city
     */

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    /**
     * Method to add a location in the city
     *
     * @param location represents the location to be added
     */

    public void addLocation(Location location) {
        locations.add(location);
    }

    public void printVisitableNotPayable() {
        List<Location> locationList = new LinkedList<>();

        for (Location i : locations) {
            if (i instanceof Visitable && !(i instanceof Payable)) {
                locationList.add(i);
            }
        }
        Collections.sort(locationList);

        System.out.println("These are the locations that are visitable but are not payable:");

        for (Location i : locationList) {
            System.out.println(i.getName());
        }
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

    @Override
    public int compareTo(Location location) {
        return 0;
    }
}