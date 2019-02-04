package OCA.ch05.interfaces;
 
interface HasFins2 {
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

public abstract class SharkFamily2 implements HasFins2 {
    public int getNumberOfFins() {
        return 8;
    }
    public abstract double getLongestFinLength();
    
    public boolean doFinsHaveScales() {
        return false;
    }
}
