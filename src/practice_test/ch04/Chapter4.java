package practice_test.ch04;

import java.util.Arrays;

class Chapter4 {

    //2
    private static class Frisbee {

        public Frisbee() {
        }
    }

    public void toss(Frisbee... f) {
        Frisbee first = f[0];
    }

    public static void main(String[] args) {
        //3
        int[] lowercase = new int[0];
        Integer[] uppercase = new Integer[0];
        Object obj;// = new Object[1];
        obj = lowercase;

        //4
        //[] double lion;
        double[] tiger;
        double bears[];

        //12
        String lion[] = new String[]{"lion"};
//        String tiger[] = new String[1] {"tiger"};
        String bear[] = new String[]{};
//        String ohMy[] = new String[0] {};

        //13
//        float[] lion1 = new float[];
        float[] tiger1 = new float[1];
//        float[] bear1 = new [] float;
//        float[] ohMy = new [1] float;       

        //19
        Integer[] lotto = new Integer[4];
        lotto[0] = new Integer(1_000_000);
        lotto[1] = new Integer(999_999);

        //25
        String[] strings = new String[2];
        System.out.println(strings);
    }

    //22
    public static void addStationName(String[] names) {
        names[names.length] = "Times Square";
    }

}
