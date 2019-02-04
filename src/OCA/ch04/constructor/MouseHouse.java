package OCA.ch04.constructor;

public class MouseHouse {

    private final int volume;
    private final String name = "The Mouse House";

    public MouseHouse(int length, int width, int height) {
        volume = length * width * height;
    }

    public static void main(String[] args) {
        MouseHouse m = new MouseHouse(1,2,3);
        System.out.println(m.volume);
    }
}
