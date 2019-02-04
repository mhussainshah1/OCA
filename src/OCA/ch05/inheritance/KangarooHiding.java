package OCA.ch05.inheritance;

class Marsupial {

    public static boolean isBiped() {
        return false;
    }

    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: " + isBiped());
    }
}

public class KangarooHiding extends Marsupial {

    public static boolean isBiped() {
        return true;
    }

    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs: " + isBiped());
    }

    public static void main(String[] args) {
        KangarooHiding joey = new KangarooHiding();
        joey.getMarsupialDescription();
        joey.getKangarooDescription();
    }
}
