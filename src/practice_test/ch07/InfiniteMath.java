package practice_test.ch07;

class Math {

    public final double secret = 2;

    public double display() {
        return secret;
    }
}

class ComplexMath extends Math {

    public final double secret = 4;

    @Override
    public double display() {
        return secret;
    }
}

public class InfiniteMath extends ComplexMath {

    public final double secret = 8;

    @Override
    public double display() {
        return secret;
    }

    public static void main(String[] numbers) {
        Math math = new InfiniteMath();
        System.out.println(math.secret);//2
        System.out.println(math.display());//8
    }
}
