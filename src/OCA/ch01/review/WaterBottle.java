package OCA.ch01.review;

public class WaterBottle {

    private String brand;
    private boolean empty;
    private float amount;

    public static void main(String[] args) {
        WaterBottle wb = new WaterBottle();
        System.out.print("Empty = " + wb.empty);
        System.out.print(", Brand = " + wb.brand);
        System.out.print(", Amount = " + wb.amount);
    }
}