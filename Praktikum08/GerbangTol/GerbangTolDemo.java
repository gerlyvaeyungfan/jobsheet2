
import java.util.Scanner;

public class GerbangTolDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int kapasitas = sc.nextInt();
        int menu;

        Queue8 myQueueK = new Queue8(kapasitas);
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
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan no plat: ");
                    String noPlat = sc.nextLine();
                    System.out.print("Masukkan no kartu: ");
                    String noKartu = sc.nextLine();
                    System.out.print("Masukkan saldo: ");
                    double saldo = sc.nextInt();

                    Kendaraan8 newKendaraan = new Kendaraan8(noPlat, noKartu, saldo);
                    myQueueK.enqueue8(newKendaraan);

                    break;
                case 2:
                    Kendaraan8 deletedData = myQueueK.dequeue8();
    
                    if (deletedData != null) {
                        System.out.println("Data yang dikeluarkan:");
                        System.out.println(deletedData);
                    }
                    break;
                case 3:
                    myQueueK.print8();
                    break;
                case 4:
                    myQueueK.peek8();
                    break;
                case 5:
                    myQueueK.clear8();
                case 6:
                    myQueueK.peekRear8();
                    break;
                default:
                    break;
            }
        } while (menu >= 1 && menu <= 5);
    }
}
