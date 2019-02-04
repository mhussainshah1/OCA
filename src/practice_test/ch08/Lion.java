package practice_test.ch08;

class BigCat {

    void roar(int level) 
        throw RuntimeException { // m1
      if (level < 3) {
            throw new IllegalArgumentException("Incomplete");
        }
        System.out.print("Roar!");
    }
}

public class Lion extends BigCat {

    public void roar() { // m2
        System.out.print("Roar!!!");
    }

    public static void main(String[] cubs) {
        final BigCat kitty = new Lion(); // m3
        kitty.roar(2);
    }
}
