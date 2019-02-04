package OCA.ch02;

public class WhileStatement {

    int roomInBelly = 5;

    public void eatCheese(int bitesOfCheese) {
        while (bitesOfCheese > 0 && roomInBelly > 0) {
            bitesOfCheese--;
            roomInBelly--;
        }
        System.out.println(bitesOfCheese + " pieces of cheese left");
    }

    public static void main(String[] args) {
        WhileStatement ws = new WhileStatement();
        ws.eatCheese(8);

        //Infinite Loop
        int x = 2;
        int y = 5;
        while (x < 10) {
            y++;
        }
    }
}
