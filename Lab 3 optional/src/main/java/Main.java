import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Location v1 = new Hotel("The Plaza Hotel", 60, 1);

        Location v2 = new Museum("The Met", LocalTime.of(9, 30), LocalTime.parse("17:00"), 10, 2);

        Location v3 = new Museum("Smithsonian", LocalTime.of(9, 0), LocalTime.of(18, 0), 20, 3);

        Location v4 = new Church("Trinity Church", LocalTime.of(7, 0), LocalTime.of(23, 0), 4);

        Location v5 = new Church("Grace Church", LocalTime.of(8, 0), LocalTime.of(22, 30), 5);

        Location v6 = new Restaurant("Red Lobster", 100, 6);

        //create city and add locations to city
        City NYC = new City();
        NYC.addLocation(v1);
        NYC.addLocation(v2);
        NYC.addLocation(v3);
        NYC.addLocation(v4);
        NYC.addLocation(v5);
        NYC.addLocation(v6);

        //set costs for locations
        v1.setCost(v2, 10);
        v1.setCost(v3, 50);
        v2.setCost(v3, 20);
        v2.setCost(v4, 20);
        v2.setCost(v5, 10);
        v3.setCost(v4, 20);
        v4.setCost(v5, 30);
        v4.setCost(v6, 10);
        v5.setCost(v6, 20);

        //print costs for locations
        v1.printCosts();
        v2.printCosts();
        v3.printCosts();
        v4.printCosts();
        v5.printCosts();
        v6.printCosts();

        System.out.println();

        NYC.printVisitableNotPayable();

        System.out.println();

        v1.showVisitingDuration();
        v2.showVisitingDuration();
        v3.showVisitingDuration();
        v4.showVisitingDuration();
        v5.showVisitingDuration();
        v6.showVisitingDuration();
    }
}