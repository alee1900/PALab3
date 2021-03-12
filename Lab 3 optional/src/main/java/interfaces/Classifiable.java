package interfaces;

/**
 * Interface Classifiable
 * Implements rank for visiting order of locations
 */

public interface Classifiable {
    /**
     * Getter for rank
     * @return the rank for the visiting order
     */

    int getRank();

    /**
     * Setter for rank
     * @param rank represents the rank for the visiting order
     */

    void setRank(int rank);
}