package enthuware.ch06;

public class Noobs {

    public void m(int a) {
        System.out.println("In int " + a);
    }

    public void m(char c) {
        System.out.println("In char " + c);
    }

    public static void main(String[] args) {
        Noobs n = new Noobs();
        int a = 'a'; //implicit widening
        char c = 663; //implicit narrowing
        n.m(a);
        n.m(c);
    }
}
