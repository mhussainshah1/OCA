package OCA.ch05.inheritance;

class Rodent {

    protected int tailLength = 4;
    protected static int teeth = 2;
    
    public void getRodentDetails() {
        System.out.println("[parentTail=" + tailLength + "]");
    }
}

public class Mouse extends Rodent {

    protected int tailLength = 8;
    protected int teeth = 4;
    
    public void getMouseDetails() {
        System.out.println("[tail=" + tailLength + ",parentTail=" + super.tailLength + "]");
        System.out.println("[teeth=" + teeth + ",parentTeeth=" + super.teeth + "]");
    }

    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.getRodentDetails();
        mouse.getMouseDetails();
    }
}
