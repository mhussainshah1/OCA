package OCA.ch05.abstractClasses;

abstract class Whale2 {

    abstract void sing();
}

public class HumpbackWhale2 extends Whale2 {

    protected void sing() { // DOES NOT COMPILE
        System.out.println("Humpback whale is singing");
    }
}