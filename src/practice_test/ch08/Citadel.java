/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package practice_test.ch08;

class CastleUnderSiegeException extends Exception {
}

class KnightAttackingException extends CastleUnderSiegeException {
}

public class Citadel {

    public void openDrawbridge() throws RuntimeException { // q1
        try {
            throw new KnightAttackingException();
        } catch (Exception e) {
            throw new ClassCastException();
        } finally {
            throw new CastleUnderSiegeException(); // q2
        }
    }

    public static void main(String[] moat) {
        new Citadel().openDrawbridge(); // q3
    }
}
