package OCA.ch05.interfaces;

public interface Carnivore {
    public default void eatMeat(); // DOES NOT COMPILE
    public int getRequiredFoodAmount() { // DOES NOT COMPILE
        return 13;
    }
}
