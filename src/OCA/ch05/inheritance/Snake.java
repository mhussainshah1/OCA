package OCA.ch05.inheritance;

class InsufficientDataException extends Exception {
}

class Reptile {

    protected boolean hasLegs() throws InsufficientDataException {
        throw new InsufficientDataException();
    }

    protected double getWeight() throws Exception {
        return 2;
    }

    protected double getHeight() throws InsufficientDataException {
        return 2;
    }

    protected int getLength() {
        return 10;
    }
}

public class Snake extends Reptile {

    @Override
    protected boolean hasLegs() {
        return false;
    }

    @Override
    protected double getWeight() throws InsufficientDataException {
        return 2;
    }

    protected double getHeight() throws Exception { // DOES NOT COMPILE
        return 2;
    }

    protected int getLength() throws InsufficientDataException { // DOES NOT COMPILE
        return 10;
    }
}
