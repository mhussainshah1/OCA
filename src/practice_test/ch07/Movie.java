package practice_test.ch07;

class Cinema {

    private String name;

    public Cinema(String name) {
        this.name = name;
    }
}

public class Movie extends Cinema {

    public Movie(String movie) {
        //compiler inserts automatically
        //super();
    }

    public static void main(String[] showing) {
        System.out.print(new Movie("Another Trilogy").name);
    }
}
