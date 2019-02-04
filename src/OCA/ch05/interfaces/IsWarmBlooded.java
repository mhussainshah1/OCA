package OCA.ch05.interfaces;

public interface IsWarmBlooded {

    boolean hasScales();

    public default double getTemperature() throws Exception {
        return 10.0;
    }
}
