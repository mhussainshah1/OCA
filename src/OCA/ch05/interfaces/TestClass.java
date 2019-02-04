package OCA.ch05.interfaces;

public class TestClass {

    public static void main(String[] args) {
        WalksOnTwoLegs example = new WalksOnTwoLegs(); // DOES NOT COMPILE
    }
}

public final interface WalksOnEightLegs { // DOES NOT COMPILE
}
