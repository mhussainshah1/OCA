package OCA.ch05.inheritance;

public class Zoo extends Object{

    public Zoo() {
        super();
        System.out.println("Zoo created");
        super(); // DOES NOT COMPILE
    }
}
