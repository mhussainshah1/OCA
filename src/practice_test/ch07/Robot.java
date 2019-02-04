package practice_test.ch07;

import java.io.*;

class Machine {

    public boolean turnOn() throws EOFException {
        return true;
    }
}

public class Robot extends Machine {

    @Override
    public boolean turnOn() throws IOException {
        return false;
    }

    public static void main(String[] doesNotCompute) throws Exception {
        Machine m = new Robot();
        System.out.print(m.turnOn());
    }
}
