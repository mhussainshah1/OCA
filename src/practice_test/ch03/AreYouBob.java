package practice_test.ch03;

public class AreYouBob {

    public static void main(String[] unused) {
        String bob = new String("bob");
        String notBob = bob;
        System.out.print((bob == notBob) + " " + (bob.equals(notBob)));
    }
}
