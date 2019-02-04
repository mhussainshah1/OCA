package OCA.ch05.review;
class Snake {
}
class Cobra extends Snake {
}
class GardenSnake {
}
class SnakeHandler {

    private Snake snake;

    public void setSnake(Snake snake) {
        System.out.println(snake);
        this.snake = snake;
    }

    public static void main(String[] args) {
        new SnakeHandler().setSnake(new Cobra());
        new SnakeHandler().setSnake(new Snake());
        new SnakeHandler().setSnake(null);
    }
}

//19. Which of the following statements can be inserted in the blank so that the code will
//compile successfully? (Choose all that apply)
//A. new Cobra()
//B. new GardenSnake()
//C. new Snake()
//D. new Object()
//E. new String("Snake")
//F. null