import java.util.Scanner;

public class PembayaranDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah metode pembayaran : ");
        int jumlahMetode = sc.nextInt();
        sc.nextLine();

        Pembayaran[] metodePembayaran = new Pembayaran[jumlahMetode];

        for (int i = 0; i < jumlahMetode; i++) {
            System.out.println("\nData metode pembayaran ke-" + (i + 1));
            System.out.print("Metode pembayaran  : ");
            String metode = sc.nextLine();
            System.out.print("Kode verifikasi    : ");
            String kode = sc.nextLine();

            metodePembayaran[i] = new Pembayaran(metode, kode);
        }

        System.out.println("\nData Metode Pembayaran :");
        for (Pembayaran metode : metodePembayaran) {
            metode.menampilkanMetodePembayaran();
            metode.menampilkanKodeVerifikasi();
        }
    }
}


