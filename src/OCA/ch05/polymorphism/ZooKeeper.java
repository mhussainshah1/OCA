package OCA.ch05.polymorphism;

class Animal {

    public String getName() {
        return "Animal";
    }
    
    public Double getHeight(){
        return 2.0;
    }       
}

class Gorilla extends Animal {

    protected String getName() { // DOES NOT COMPILE
        return "Gorilla";
    }
    
    public Number getHeight(){
        return 1;
    }
}

public class ZooKeeper {

    public static void main(String[] args) {
        Animal animal = new Gorilla();
        System.out.println(animal.getName());
    }
}
