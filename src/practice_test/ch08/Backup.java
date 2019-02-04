/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package practice_test.ch08;

import java.io.*;

public class Backup {

    public void performBackup() {
        try {
            throw new IOException("Disk not found");
        } catch (Exception e) {
            try {
                throw new FileNotFoundException("File not found");
            } catch (FileNotFoundException e) { // z1
                System.out.print("Failed");
            }
        }
    }

    public static void main(String... files) {
        new Backup().performBackup(); // z2
    }
}
