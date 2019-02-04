package practice_test.ch08;

class Organ {

    public void operate() throws RuntimeException {
        throw new RuntimeException("Not supported");
    }
}

public class Heart extends Organ {

    public void operate() throws Exception {
        System.out.print("beat");
    }

    public static void main(String... cholesterol) throws Exception {
        try {
            new Heart().operate();
        } finally {
        }
    }
}
