package OCA.ch04;
public class Swan {
    private int numberEggs; // private

    public int getNumberEggs() { // getter
        return numberEggs;
    }

    public void setNumberEggs(int numberEggs) { // setter
        if (numberEggs >= 0) // guard condition
        {
            this.numberEggs = numberEggs;
        }
    }
}
