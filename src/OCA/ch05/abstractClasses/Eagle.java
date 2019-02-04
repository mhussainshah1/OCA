package OCA.ch05.abstractClasses;

abstract class Animal {

    public abstract String getName();
}

class Walrus extends Animal { // DOES NOT COMPILE
}

public abstract class Eagle extends Animal {
}
