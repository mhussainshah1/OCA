package OCA.ch01;

import java.util.ArrayList;
import java.util.List;

public class Finalizer {

    private static List objects = new ArrayList();

    protected void finalize() {
        objects.add(this); // Don't do this
        System.out.println("Calling finalize");
    }

    public static void main(String[] args) {
        Finalizer f = new Finalizer();
    }
}
