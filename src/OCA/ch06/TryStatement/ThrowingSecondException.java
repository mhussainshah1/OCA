package OCA.ch06.TryStatement;

import java.io.FileReader;
import java.io.IOException;

public class ThrowingSecondException {

    public static void main(String[] args) {        
        FileReader reader = null;
        try {
            System.out.println("before");
            reader = read();
        } catch (IOException e) {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException inner) {
                System.out.println("inner");
            }
        }        
        System.out.println(exceptions(""));
    }

    private static FileReader read() throws IOException {
        // CODE GOES HERE
        throw new IOException();
    }

    public static void exceptions() throws Exception {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            throw new Exception();
        } finally {
            throw new RuntimeException();
        }
    }

    public static String exceptions(String result) {
        String v = null;
        try {
            try {
                result += "before ";
                v.length();
                result += "after ";
            } catch (NullPointerException e) {
                result += "catch ";
                throw new RuntimeException();
            } finally {
                result += "finally ";
                throw new Exception();
            }
        } catch (Exception e) {
            result += "done";
        }
        return result;
    }
}