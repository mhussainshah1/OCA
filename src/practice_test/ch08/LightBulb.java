/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package practice_test.ch08;

interface Source {

    void flipSwitch() throws Exception;
}

public class LightBulb implements Source {

    @Override
    public void flipSwitch() {
        try {
            throws
            new RuntimeException("Circuit Break!");
        } finally {
            System.out.print("Flipped!");
        }
    }

    public static void main(String... electricity) throws Throwable {
        final Source bulb = new LightBulb();
        bulb.flipSwitch();
    }
}
