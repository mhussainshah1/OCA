package OCA.ch05.inheritance;

class Animal6 {

    public int length = 2;
}

public class Jellyfish extends Animal6 {

    public int length = 5;

    public static void main(String[] args) {
        Jellyfish jellyfish = new Jellyfish();
        Animal6 animal = new Jellyfish();
        System.out.println(jellyfish.length);
        System.out.println(animal.length);
    }
}
