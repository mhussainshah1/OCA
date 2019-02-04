package OCA.ch05.interfaces;

interface CanBurrow {

    /*public static final*/ int MINIMUM_DEPTH = 2;// BY DEFAULT

    /*public abstract */ int getMaximumDepth();// BY DEFAULT
}

public class FieldMouse implements CanBurrow {

    static int MINIMUM_DEPTH = 4;// It hides interface method

    public int getMaximumDepth() {        
        return 10;
    }

    public static void main(String[] args) {
        MINIMUM_DEPTH = 42;
        System.out.println(MINIMUM_DEPTH);
        System.out.println(CanBurrow.MINIMUM_DEPTH);
        new FieldMouse().getMaximumDepth();
    }
}
