package OCA.ch05.abstractClasses;

abstract class Animal2 {

    public abstract String getName();
}

public class Walrus extends Animal2 { // DOES NOT COMPILE
}
