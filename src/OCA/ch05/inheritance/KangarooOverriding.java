package OCA.ch05.inheritance;

class Marsupial1 {

    public boolean isBiped() {
        return false;
    }

    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: " + isBiped());
    }
}

public class KangarooOverriding extends Marsupial1 {

    @Override public boolean isBiped() {
        return true;
    }

    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs: " + isBiped());
    }

    public static void main(String[] args) {
        KangarooOverriding joey = new KangarooOverriding();
        joey.getMarsupialDescription();
        joey.getKangarooDescription();
    }
}
