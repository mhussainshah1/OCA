package OCA.ch04.pond.goose;

import OCA.ch04.pond.shore.Bird;// in a different package

public class Gosling extends Bird { // extends means create subclass

    public void swim() {
        floatInWater(); // calling protected member
        System.out.println(text); // calling protected member
    }
}
