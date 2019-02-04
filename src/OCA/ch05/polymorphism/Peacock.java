package OCA.ch05.polymorphism;

class Bird2 {

    public String getName() {
        return "Unknown";
    }

    public void displayInformation() {
        System.out.println("The bird name is: " + getName());
    }
}

public class Peacock extends Bird2 {

    public String getName() {
        return "Peacock";
    }

    public static void main(String[] args) {
        Bird2 bird = new Peacock();
        bird.displayInformation();
    }
}
