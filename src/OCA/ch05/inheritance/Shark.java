package OCA.ch05.inheritance;

class Fish {

    protected int size;
    private int age;

    public Fish(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class Shark extends Fish {

    private int numberOfFins = 8;

    public Shark(int age) {
        super(age);
        this.size = 4;
    }

    public void displaySharkDetails() {
        //calling parent class members
        System.out.print("Shark with age: " + getAge());
    /*or*/  System.out.print("Shark with age: " + this.getAge());
    /*or*/  System.out.print("Shark with age: " + super.getAge());

        System.out.print(" and " + size + " meters long");
    /*or*/  System.out.print(" and " + this.size + " meters long");
    /*or*/  System.out.print(" and " + super.size + " meters long");
        
    //calling child class members
        System.out.print(" with " + numberOfFins + " fins");
    /*or*/  System.out.print(" with " + this.numberOfFins + " fins");
        System.out.print(" with " + super.numberOfFins + " fins"); // DOES NOT COMPILE
    }
}
