package practice_test.ch07;

interface Sphere {
    //abstract keyword is valid in the interface
    //abstract void mymethod();

    default String getName() {
        return "Unknown";
    }
}

abstract class Planet {

    abstract String getName();
}

public class Mars extends Planet implements Sphere {

    public Mars() {
        super();
    }

    public String getName() {
        return "Mars";
    }

    public static void main(final String[] probe) {
        System.out.print(((Planet) new Mars()).getName());
    }
}
