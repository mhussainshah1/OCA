package enthuware.ch04;

public class FunWithArgs {

    public static void main(String[][] args) {
        System.out.println(args[0][1]);
    }

    public static void main(String[] args) {
        FunWithArgs fwa = new FunWithArgs();
        String[][] newargs = {{"a","b","c"}};//{args};
        fwa.main(newargs);
    }
}
