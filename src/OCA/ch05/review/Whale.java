package OCA.ch05.review;

public abstract class Whale {

 public abstract void dive() {};
 public static void main(String[] args) {
        Whale whale = new Orca();
        whale.dive();
    }
}

class Orca extends Whale {

    public void dive(int depth) {
        System.out.println("Orca diving");
    }
}

