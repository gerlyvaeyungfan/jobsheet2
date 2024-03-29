public class SnakeMain {
    public static void main(String[] args) {

        Snake snake1 = new Snake(4, 2);
        Snake snake2 = new Snake(1, 2);

        System.out.println("Posisi awal:");
        snake1.printPosition();
        snake2.printPosition();

        snake1.moveRight();
        snake1.moveDown();

        snake2.moveLeft();
        snake2.moveUp();

        System.out.println("\nPosisi setelah perubahan:");
        snake1.printPosition();
        snake2.printPosition();
    }
}
