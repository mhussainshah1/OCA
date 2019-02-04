package OCA.ch04.pond.duck;

import OCA.ch04.pond.goose.Goose;

public class GooseWatcher {

    public void watch() {
        Goose goose = new Goose();
        goose.floatInWater(); // DOES NOT COMPILE
    }
}
