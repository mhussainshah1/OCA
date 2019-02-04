package OCA.ch05.review;

interface CanFly {

    void fly();
}

interface HasWings {

    public abstract Object getWindSpan();
}

abstract class Falcon implements CanFly, HasWings {
}
