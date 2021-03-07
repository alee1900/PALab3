import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class City {
    private List<Location> locations;

    public City() {
        this.locations = new LinkedList<>();
    }

    public City(List<Location> locations) {
        this.locations = locations;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

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
