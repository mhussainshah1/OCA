package practice_test.ch03;

public class Chapter3 {

    public static void main(String[] args) {
        //2
        int meal = 5;
        int tip = 2;
        int total = meal + (meal > 6 ? ++tip : --tip);
        System.out.println(total);

        //6
        long thatNumber = 5 >= 5 ? 1 + 2 : 1 * 1;
        if (++thatNumber < 4) {
            thatNumber += 1;
        }
        System.out.println(thatNumber);

        //15
        int hops = 0;
        int jumps = 0;
        jumps = hops++;
//        if (jumps) { //Error: int cant be converted into boolean
//            System.out.print("Jump!");
//        } else {
//            System.out.print("Hop!");
//        }

        //19
        int time = 11;
        int day = 4;
        String dinner = time > 10
                ? day > 13 ? "Takeout" : "Salad"
                : "Leftovers";
        System.out.println(dinner);

        //27
        String myTestVariable = "100";
        //String myTestVariable = null;
        System.out.println(myTestVariable.equals(null));

        //30
        int x = 10, y = 5;
        boolean w = true, z = false;
        x = w ? y++ : y--;//5
        w = !z;//true
        System.out.println((x + y) + " " + (w ? 5 : 10));//(5 + 6) 5

        //44
        int characters = 5;
        int story = 3;
        double movieRating = characters <= 4 ? 3 : story > 1 ? 2 : 1;
        System.out.println(movieRating);
    }
}
