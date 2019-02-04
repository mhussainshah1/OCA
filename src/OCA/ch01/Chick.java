package OCA.ch01;

public class Chick {

    public void Chick() { //NOT A CONSTRUCTOR
        System.out.println("in constructor");
    }

    public static void main(String[] args) {
        Chick c = new Chick();
    }
}
