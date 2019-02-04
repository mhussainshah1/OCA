package practice_test.ch07;

interface MusicCreator {

    public Number play();
}

abstract class StringInstrument {

    public Long play() {
        return 3L;
    }
}

public class Violin extends StringInstrument implements MusicCreator {

    @Override
    public Long play() {
        return 12L;
    }
}
