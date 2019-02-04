package OCA.ch05.interfaces;

interface Herbivore1 {

    public void eatPlants();
}

interface Omnivore {

    public void eatPlants();

    public void eatMeat();
}
//In this scenario, the signatures for the two interface methods eatPlants() are compatible,
//so you can defi ne a class that fulfi lls both interfaces simultaneously:

public class Bear1 implements Herbivore1, Omnivore {

    public void eatMeat() {
        System.out.println("Eating meat");
    }

    public void eatPlants() {
        System.out.println("Eating plants");
    }
}
