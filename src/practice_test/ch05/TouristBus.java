package practice_test.ch05;

public class TouristBus {

    public static void main(String... args) {
        //34
        String[] nycTourLoops = new String[]{"Downtown", "Uptown", "Brooklyn"};
        String[] times = new String[]{"Day", "Night"};
//        for (int i = 0, j = 0; i < nycTourLoops.length 
//              && j < times.length; i++; j++)
//        {
//        System.out.print(nycTourLoops[i] + " " + times[j] + "-");
//        }

        //42
        nycTourLoops = new String[]{"Downtown", "Uptown", "Brooklyn"};
        times = new String[]{"Day", "Night"};
        for (int i = 0, j = 0; i < nycTourLoops.length
                && j < times.length; i++, j++) {
            System.out.print(nycTourLoops[i] + " " + times[j] + "-");
        }

        //50
        nycTourLoops = new String[]{"Downtown", "Uptown", "Brooklyn"};
        times = new String[]{"Day", "Night"};
        for (int i = 0, j = 0; i < 1; i++, j++) {
            System.out.println(nycTourLoops[i] + " " + times[j]);
        }
    }
}
