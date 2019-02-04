package OCA.ch05.inheritance;

class Bird1 {

    public final boolean hasFeathers() {
        return true;
    }
}

public class Penguin extends Bird1 {

    @Override
    public final boolean hasFeathers() { // DOES NOT COMPILE
        return false;
    }
}
