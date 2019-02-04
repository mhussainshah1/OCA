package practice_test.ch06;

public final class Games {

    public final static int finish(/*final*/int score) {
        final int win = 3;
        /*final*/ int result = score++ < 5 ? 2 : win;
        return result += win;
    }

    public static void main(final String[] v) {
        System.out.print(finish(Integer.parseInt(v[0])));
    }
}
