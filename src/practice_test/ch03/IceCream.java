package practice_test.ch03;

public class IceCream {
    //24

    public final static void main(String... args) {
        int flavors = 30;
        int eaten = 0;
        switch (flavors) {
            case 30:
                eaten++;//1
            case 40:
                eaten += 2;//3
            default:
                eaten--;//2
        }
        System.out.print(eaten);
    }
}
