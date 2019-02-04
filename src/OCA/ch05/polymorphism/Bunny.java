package OCA.ch05.polymorphism;

interface Hop {
    /*public*/ static int getJumpHeight() {//BY DEFAULT
        return 8;
    }
}

interface Leap{
    static int getJumpHeight() { //BY DEFAULT
        return 5;
    }
}

public class Bunny implements Hop, Leap {
    public void printDetails() {
//      System.out.println(getJumpHeight()); // DOES NOT COMPILE
//      System.out.println(Bunny.getJumpHeight());// DOES NOT COMPILE
        System.out.println(Hop.getJumpHeight());
        System.out.println(Leap.getJumpHeight());
    }
}
