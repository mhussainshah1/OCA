package OCA.ch05.abstractClasses;

abstract class Whale1 {

    private abstract void sing(); // DOES NOT COMPILE
}

public class HumpbackWhale1 extends Whale1 {

    private void sing() {
        System.out.println("Humpback whale is singing");
    }
}