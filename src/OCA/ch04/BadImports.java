package OCA.ch04;

import static java.util.Arrays; // DOES NOT COMPILE
import static java.util.Arrays.asList;
static import java.util.Arrays.*; // DOES NOT COMPILE

import static Math.PI;
import static StrictMath.PI;


public class BadStaticImports {

    public static void main(String[] args) {
        Arrays.asList("one"); // DOES NOT COMPILE
    }
}
