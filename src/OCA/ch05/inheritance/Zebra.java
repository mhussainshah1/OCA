package OCA.ch05.inheritance;

class Animal2 {

    private int age;

    public Animal2(int age) {
        super();
        this.age = age;
    }
}

public class Zebra extends Animal2 {

    public Zebra(int age) {
        super(age);
    }

    public Zebra() {
        this(4);
    }
}
