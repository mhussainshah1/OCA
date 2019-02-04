package practice_test.ch04;

import java.util.Arrays;

public class SortAndSearch {

    public static void main(String[] args) {
        //10
        String[] nums = new String[]{"1", "9", "10"};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        //17
        String[] os = new String[]{"Mac", "Linux", "Windows"};
        Arrays.sort(os);
        System.out.println(Arrays.binarySearch(os, "Mac"));//1

        //29
        os = new String[]{"Mac", "Linux", "Windows"};
        Arrays.sort(os);
        System.out.println(Arrays.binarySearch(os, "RedHat"));//-3

        //41.
        os = new String[]{"Mac", "Linux", "Windows"};
        System.out.println(Arrays.binarySearch(os, "Linux"));//1 - undefined

        //47
        os = new String[]{"Linux", "Mac", "Windows"};
        System.out.println(Arrays.binarySearch(os, "Linux"));//0

    }
}
