public class Dragon {
    private int x;
    private int y;
    private int direction;

    public Dragon(int initialX, int initialY, int initialDirection) {
        x = initialX;
        y = initialY;
        changeDirection(initialDirection);
    }

    public void changeDirection(int newDirection) {
        if (newDirection >= 1 && newDirection <= 4) {
            direction = newDirection;
        } else {
            System.out.println("Arah tidak valid.");
        }
    }

    public void move(int steps) {
        switch (direction) {
            case 1:
                y += steps;
                break;
            case 2:
                x += steps;
                break;
            case 3:
                y -= steps;
                break;
            case 4:
                x -= steps;
                break;
        }
    }

    public void printStatus() {
        System.out.println("Dragon Position: (" + x + ", " + y + ")");
        System.out.println("Direction: " + direction);
    }
}
