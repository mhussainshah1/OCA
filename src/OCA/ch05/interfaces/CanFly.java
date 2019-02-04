package OCA.ch05.interfaces;

public interface CanFly {
//public abstract interface CanFly {

    void fly(int speed);
//  public abstract void fly(int speed);
    
    abstract void takeoff();
//  public abstract void takeoff();
    
    public abstract double dive();
}

//The compiler will convert above to the following
/**
public abstract interface CanFly {

    public abstract void fly(int speed);

    public abstract void takeoff();

    public abstract double dive();
}
*/