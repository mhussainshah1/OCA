package OCA.ch05.interfaces;

interface Herbivore4 {

    public int eatPlants();
}

interface Omnivore4 {

    public void eatPlants();
}

interface Supervore extends Herbivore4, Omnivore4 {
} // DOES NOT COMPILE

public abstract class AbstractBear implements Herbivore4, Omnivore4 {
}
// DOES NOT COMPILE
