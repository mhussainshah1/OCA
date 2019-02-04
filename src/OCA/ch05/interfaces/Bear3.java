package OCA.ch05.interfaces;

interface Herbivore3 {

    public int eatPlants();
}

interface Omnivore3 {

    public void eatPlants();
}

public class Bear3 implements Herbivore3, Omnivore3 {    

    public void eatPlants() { // DOES NOT COMPILE
        System.out.println("Eating plants");
    }
    
    public int eatPlants() { // DOES NOT COMPILE
        System.out.println("Eating plants: 10");
        return 10;
    }
}
