package OCA.ch05.polymorphism;

class Bird {
}

public class Fish {

    public static void main(String[] args) {
        Fish fish = new Fish();
        Bird bird = (Bird) fish; // DOES NOT COMPILE
    }
}
