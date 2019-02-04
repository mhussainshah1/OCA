package OCA.ch05.interfaces;

interface HasFins {

    public default int getNumberOfFins() {
        return 4;
    }

    public default double getLongestFinLength() {
        return 20.0;
    }

    public default boolean doFinsHaveScales() {
        return true;
    }
}

public interface SharkFamily extends HasFins {

    public default int getNumberOfFins() {
        return 8;
    }

    public double getLongestFinLength();

    public boolean doFinsHaveScales() { // DOES NOT COMPILE
        return false;
    }
}
