package OCA.ch05.inheritance;

class Mammal {
    public Mammal(int age) {
    }
}

public class Elephant extends Mammal { 

    public Elephant() {// DOES NOT COMPILE
        super(10);
    }

}
