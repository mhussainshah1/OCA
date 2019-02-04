package practice_test.ch05;

public class Chapter5 {

    public static void main(String[] args) {
        //11
//        int singer = 0;
//        while (singer)
//            System.out.println(singer++);

        //25 Infinite Loop
//        int singer = 0;
//        while (singer > 0)
//            System.out.println(singer++);
        //14
        String letters = "";
        while (letters.length() != 2) {
            letters += "a";
        }
        System.out.println(letters);

        //28 Infinite loop
//        letters = "";
//        while (letters.length() != 3)
//            letters+="ab";
//        System.out.println(letters);
        //17
        do {
            int count = 0;
            do {
                count++;
            } while (count < 2);
            break;
        } while (true);
//        System.out.println(count);

        //40
        int count = 0;
        do {
            do {
                count++;
            } while (count < 2);
            break;
        } while (true);
        System.out.println(count);

        //21
//        do(
//            System.out.println("helium");
//        ) while (false);
        //22
        String[] fun = new String[]{"1", "2", "3"};
        for (int i = 0; i < fun.length; i++) {
            System.out.println(fun[i]);
        }

        //It is equivalent to
        for (String f : fun) {
            System.out.println(f);
        }

        //32
        fun = new String[]{"1", "2", "3"};
        for (int i = fun.length - 1; i >= 0; i--) {
            System.out.println(fun[i]);
        }

        //23
        letters:
        for (char ch = 'a'; ch <= 'z'; ch++) {
            numbers:
            for (int n = 0; n <= 10; n++) {
                System.out.print(ch);
                break;
                //or
                //break numbers;
            }
            System.out.print("-");
        }
        System.out.println("");

        //24
        letters:
        for (char ch = 'a'; ch <= 'z'; ch++) {
            numbers:
            for (int n = 0; n <= 10; n++) {
                System.out.print(ch);
                continue letters;
            }
        }

        //27
        boolean balloonInflated = false;
        do {
            if (!balloonInflated) {
                balloonInflated = true;
                System.out.print("\ninflate-");
            }
        } while (!balloonInflated);
        System.out.println("done");

        //49 Infinite Loop
        boolean baloonInflated = false;
        do {
            if (!baloonInflated) {
                baloonInflated = true;
                System.out.print("inflate-");
            }
        } while (baloonInflated);
        System.out.println("done");

        //31
        int k = 0;
        for (int i = 10; i > 0; i--) {
            while (i > 3) {
                i -= 3;
            }
            k += 1;
        }
        System.out.println(k);

        //39
//        StringBuilder builder = new StringBuilder();
//        String str = new String("Leaves growing");
//        do {
//        System.out.println(str);
//        } while (builder);
//        System.out.println(builder);        
    }
}
