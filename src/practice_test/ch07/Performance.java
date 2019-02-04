package practice_test.ch07;

interface SpeakDialogue {

    default int talk() {
        return 7;
    }
}

interface SingMonologue {

    default int talk() {
        return 5;
    }
}

public class Performance implements SpeakDialogue, SingMonologue {

    public int talk(String... x) {
        return x.length;
    }

    public static void main(String[] notes) {
        System.out.print(new Performance().talk(notes));
    }
}
