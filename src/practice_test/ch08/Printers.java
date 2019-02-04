package practice_test.ch08;

import java.io.*;

public class Printers {

    public void print() {
        try {
            throw new FileNotFoundException();
        } catch (IOException exception) {
            System.out.print("Z");
        } catch (FileNotFoundException enfe) {
            System.out.print("X");
        } finally {
            System.out.print("Y");
        }
    }
