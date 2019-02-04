package OCA.ch05.abstractClasses;

abstract class Animal3 {

    public abstract String getName();
}

class Bird extends Animal3 { // DOES NOT COMPILE
}

class Flamingo extends Bird {

    public String getName() {
        return "Flamingo";
    }
}
