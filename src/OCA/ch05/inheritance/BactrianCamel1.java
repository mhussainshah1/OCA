package OCA.ch05.inheritance;

class Camel1 {
    private String getNumberOfHumps() {
        return "Undefined";
    }
}

public class BactrianCamel1 extends Camel1 {
    private int getNumberOfHumps() {
        return 2;
    }
}