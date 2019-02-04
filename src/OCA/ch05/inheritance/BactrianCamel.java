package OCA.ch05.inheritance;

class Camel {

    protected String getNumberOfHumps() {
        return "Undefined";
    }
}

public class BactrianCamel extends Camel {

    private int getNumberOfHumps() { // DOES NOT COMPILE
        return 2;
    }
}
