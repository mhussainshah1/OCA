package practice_test.ch07;

interface Horn {

    public Integer play();
}

abstract class Woodwind {

    public Short play() {
        return 3;
    }
}

public final class Saxophone extends Woodwind implements Horn {

    public play() {
        return null;
    }
}
