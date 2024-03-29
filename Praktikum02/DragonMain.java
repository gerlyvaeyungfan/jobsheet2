public class DragonMain {
    public static void main(String[] args) {
        Dragon dragon1 = new Dragon(0, 0, 2);
        Dragon dragon2 = new Dragon(5, 5, 3);

        System.out.println("Status awal:");
        dragon1.printStatus();
        dragon2.printStatus();

        dragon1.changeDirection(1);
        dragon1.move(3);

        dragon2.changeDirection(4);
        dragon2.move(2);

        System.out.println("\nStatus setelah perubahan:");
        dragon1.printStatus();
        dragon2.printStatus();
    }
}
