package OCA.ch05.inheritance;

class Primate {

    public Primate() {
        System.out.println("Primate");
    }

    public static void main(String[] args) {
    }
}

class Ape extends Primate {

    public Ape() {
        System.out.println("Ape");
    }
}

public class Chimpanzee extends Ape {

    public static void main(String[] args) {
        new Chimpanzee();
    }
}
