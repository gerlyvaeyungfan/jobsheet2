import java.util.Scanner;

public class QueueDemo {
    public static void main(String[] args) {
        int menu;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int kapasitas = sc.nextInt();
        QueueK myQueueK = new QueueK(kapasitas);

        do {
            System.out.println("\nMasukkan operasi yang diinginkan");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Print");
            System.out.println("4. Peek");
            System.out.println("5. Clear");
            System.out.println("6. Exit");
            System.out.println("----------------------------------");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int newData = sc.nextInt();
                    myQueueK.enqueueK(newData);
                    break;
                case 2:
                    int deleteData = myQueueK.dequeueK();
    
                    if (deleteData != 0) {
                        System.out.println("Data yang dikeluarkan: " + deleteData);
                    }
                    break;
                case 3:
                    myQueueK.printK();
                    break;
                case 4:
                    myQueueK.peekK();
                    break;
                case 5:
                    myQueueK.clearK();
                    break;
                default:
                    break;
            }
        } while (menu >= 1 && menu <= 5);
    }
}
