package practice_test.ch02;

public class Person {

    public Person youngestChild;

    public static void main(String... args) {
        Person elena = new Person();
        Person diana = new Person();
        elena.youngestChild = diana;
        diana = null;
        Person zoe = new Person();
        elena.youngestChild = zoe;
        zoe = null;
        System.gc();
    }

    public void finalize() {
        System.out.println("eliggible for gc");
    }
}
