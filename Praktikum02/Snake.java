public class Snake {
    private int x;
    private int y;

    public Snake(int initialX, int initialY) {
        x = initialX;
        y = initialY;
    }

    public void moveLeft() {
        x--;
    }

    public void moveRight() {
        x++;
    }

    public void moveUp() {
        y++;
    }

    public void moveDown() {
        y--;
    }

    public void printPosition() {
        System.out.println("Snake Position: (" + x + ", " + y + ")");
    }
}
