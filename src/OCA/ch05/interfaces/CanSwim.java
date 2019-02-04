package OCA.ch05.interfaces;

public interface CanSwim {

    int MAXIMUM_DEPTH = 100;
//  public static final int MAXIMUM_DEPTH = 100;
    
    final static boolean UNDERWATER = true;
//  public static final boolean UNDERWATER = true;
    
    public static final String TYPE = "Submersible";
}

//The compiler will convert above to the following
/* 
public interface CanSwim {

    public static final int MAXIMUM_DEPTH = 100;
    public static final boolean UNDERWATER = true;
    public static final String TYPE = "Submersible";
}
*/