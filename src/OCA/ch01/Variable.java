package OCA.ch01;

public class Variable {

    String zooName;
    int numberAnimals;

    {
        zooName = "The Best Zoo";
        numberAnimals = 100;
    }

    String zooName1 = "The Best Zoo";
    int numberAnimals1 = 100;

    // String st1, st2;
    String s3 = "yes", s4 = "no";
    int j1, j2, j3 = 0;

    //int num, String value; // DOES NOT COMPILE
    boolean b1, b2;
    String s1 = "1", s2;
    //double d1, double d2; //DOES NOT COMPILE
    int i1;
    int i2;
    //int i3; i4 ; //DOES NOT COMPILE

    public static void main(String[] args) {
        int okidentifier;
        int $OK2Identifier;
        int _alsoOK1d3ntifi3r;
        int __SStillOkbutKnotsonice$;
        int Do;

        /*
        //Illegel
        int 3DPointClass;   // identifiers cannot begin with a number
        int hollywood@vine; // @ is not a letter, digit, $ or _
        int *$coffee;       // * is not a letter, digit, $ or _
        int public;         // public is a reserved word
         */
    }

    //Local Variable
    /*
    public int notValid() {
        int y = 10;
        int x;
        int reply = x + y; // DOES NOT COMPILE
        return reply;
    }
     */
    public int valid() {
        int y = 10;
        int x; // x is declared here
        x = 3; // and initialized here
        int reply = x + y;
        return reply;
    }

    /**
     * answer is initialized in both of them so the compiler is perfectly happy.
     * onlyOneBranch is only initialized if check happens to be true. The
     * compiler knows there is the possibility for check to be false, resulting
     * in uninitialized code, and gives a compiler error.
     *
     * @param check
     */
    /*
    public void findAnswer(boolean check) {
        int answer;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.println(answer);
        System.out.println(onlyOneBranch); // DOES NOT COMPILE
    }
     */
    /**
     * There are two local variables in this method.
     *
     * bitesOfCheese is declared inside the method. piecesOfCheese is called a
     * method parameter.
     *
     * @param piecesOfCheese
     */
    public void eat(int piecesOfCheese) {
        int bitesOfCheese = 1;
    }

    public void eatIfHungry(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
        } // bitesOfCheese goes out of scope here
        //System.out.println(bitesOfCheese);// DOES NOT COMPILE
    }

    public void eatIfHungry2(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
            {
                boolean teenyBit = true;
                System.out.println(bitesOfCheese);
            }
        }
        //System.out.println(teenyBit); // DOES NOT COMPILE
    }

    public void eatMore(boolean hungry, int amountOfFood) {
        int roomInBelly = 5;
        if (hungry) {
            boolean timeToEat = true;
            while (amountOfFood > 0) {
                int amountEaten = 2;
                roomInBelly = roomInBelly - amountEaten;
                amountOfFood = amountOfFood - amountEaten;
            }
        }
        System.out.println(amountOfFood);
    }
}
