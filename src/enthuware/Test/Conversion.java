package enthuware.Test;

public class Conversion {

    final static public void main(String[] args) {
        byte starting = 3;
        short firstValue = 5;
        int secondValue = 7;
        int functionValue = (int) (starting / 2 + firstValue / 2 + (int) firstValue / 3) + secondValue / 2;
        System.out.println(functionValue);
    }
}
