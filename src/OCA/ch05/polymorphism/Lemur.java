package OCA.ch05.polymorphism;

class Primate {

    public boolean hasHair() {
        return true;
    }
}

interface HasTail {

    public boolean isTailStriped();
}

public class Lemur extends Primate implements HasTail {

    public int age = 10;

    public boolean isTailStriped() {
        return false;
    }

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);

        //object reference pass into interface reference
        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());
//        System.out.println(hasTail.age); // DOES NOT COMPILE

        //object reference pass into superclass reference
        Primate primate = lemur;
        System.out.println(primate.hasHair());
//        System.out.println(primate.isTailStriped()); // DOES NOT COMPILE

        Object lemurAsObject = lemur;

//        Lemur lemur2 = primate; // DOES NOT COMPILE
        Lemur lemur3 = (Lemur) primate;
        System.out.println(lemur3.age);
    }
}
