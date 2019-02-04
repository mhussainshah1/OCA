package OCA.ch05.interfaces;

public interface CanDig {
    private int MAXIMUM_DEPTH = 100; // DOES NOT COMPILE
    protected abstract boolean UNDERWATER = false; // DOES NOT COMPILE
    public static String TYPE; // DOES NOT COMPILE
}
