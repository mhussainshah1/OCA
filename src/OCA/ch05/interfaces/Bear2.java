package OCA.ch05.interfaces;

interface Herbivore2 {

    public int eatPlants(int quantity);
}

interface Omnivore2 {

    public void eatPlants();
}

public class Bear2 implements Herbivore2, Omnivore2 {

    public int eatPlants(int quantity) {
        System.out.println("Eating plants: " + quantity);
        return quantity;
    }

    public void eatPlants() {
        System.out.println("Eating plants");
    }
}
