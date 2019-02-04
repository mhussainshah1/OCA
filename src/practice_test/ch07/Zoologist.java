package practice_test.ch07;

class Canine1 {

}

class Dog extends Canine1 {

}

class Wolf extends Canine1 {
}

final class Husky extends Dog {
}

public class Zoologist {

    Canine1 animal;

    public final void setAnimal(Dog animal) {
        this.animal = animal;
    }

    public static void main(String[] furryFriends) {
        new Zoologist().setAnimal(new Wolf());
    }
}
