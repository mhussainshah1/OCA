package OCA.ch06.TryStatement;

public class MyTry {

    public static void main(String[] args) {
        System.out.println(explore(""));
        System.out.println(explore("", 1));
        System.out.println(explore("", 1, 2));
    }

    static String explore(String s) {
        try {
            s += "t";
        } catch (Exception e) {
            s += "c";
        } finally {
            s += "f";
        }
        return s += "a";
    }

    static String explore(String s, int a) {
        try {
            s += "t";
            throw new Exception();
        } catch (Exception e) {
            s += "c";
        } finally {
            s += "f";
        }
        return s += "a";
    }

    static String explore(String s, int a, int b) {
        try {
            s += "t";
            throw new Exception();
        } catch (Exception e) {
            System.exit(0);
            s += "c";
        } finally {
            s += "f";            
        }
        return s += "a";
    }
}
