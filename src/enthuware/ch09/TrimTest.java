package enthuware.ch09;


public class TrimTest {

    public static void main(String args[]) {
        String blank = " ";  // one space       
        String line = blank + "hello" + blank + blank;
        line.concat("world");
        String newLine = line.trim();
        System.out.println(newLine);
        System.out.println((int) (line.length() + newLine.length()));
    }
}
