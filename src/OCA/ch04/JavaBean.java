package OCA.ch04;

public class JavaBean {
    
    /**
     * Properties are private.
     */
    private int numEggs;
    private boolean happy;

    /**
     * Getter methods begin with "is" if the property is a boolean.
     */
    public boolean isHappy() {
        return happy;
    }

    /**
     * Getter methods begin with "get" if the property is not a boolean.
     */
    public int getNumEggs() {
        return numEggs;
    }

    //Setter methods begin with set. 
    public void setHappy(boolean happy) {
        this.happy = happy;
    }

    /**
     * The method name must have a prefix of set/get/is, followed by the first
     * letter of the property in uppercase, followed by the rest of the property
     * name.
     */
    public void setNumEggs(int num) {
        numEggs = num;
    }
}
