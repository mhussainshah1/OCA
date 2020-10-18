package OCA.ch05.inheritance;

class Animal {

    private int age;

    public Animal(int age) {
        super(); // Refers to constructor in java.lang.Object
        this.age = age;
    }
}

public class Zebra extends Animal {

    public Zebra(int age) {
        super(age); // Refers to constructor in Animal
    }

    public Zebra() {
        this(4); // Refers to constructor in Zebra with int argument
    }
}
