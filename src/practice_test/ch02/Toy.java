package practice_test.ch02;

public class Toy {

    public void play() {
        System.out.print("play-");
    }

    //Garbage collector calls finalize method once for each object
    @Override
    public void finalize() throws Throwable {
        try {
            System.out.print("clean-");
        } finally {
            super.finalize();
        }
    }

    public static void main(String[] fun) {
        Toy car = new Toy();
        car.play();
        car = null;
        System.gc();
        Toy doll = new Toy();
        doll.play();
        doll = null;
        System.gc();
    }
}
