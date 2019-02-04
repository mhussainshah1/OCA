/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_test.ch04;

import java.util.*;

public class EchoFirst {

    public static void main(String[] args) {
        args = new String[2];
        args[0] = "seed";
        args[1] = "flower";

        String one = args[0];
        Arrays.sort(args);
        int result = Arrays.binarySearch(args, one);
        System.out.println(result);
    }
}
