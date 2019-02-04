package OCA.ch04.pond.inland;// different package than Bird

import OCA.ch04.pond.shore.Bird;

public class BirdWatcherFromAfar {

    public void watchBird() {
        Bird bird = new Bird();
        bird.floatInWater(); // DOES NOT COMPILE
        System.out.println(bird.text); // DOES NOT COMPILE
    }
}
