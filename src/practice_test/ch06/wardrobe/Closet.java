package practice_test.ch06.wardrobe;

import static practice_test.ch06.clothes.Store.getClothes;

public class Closet {

    public void borrow() {
        System.out.print("Borrowing clothes: " + getClothes());
    }
}
