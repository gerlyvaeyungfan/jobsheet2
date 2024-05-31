import java.util.Scanner;

public class ProgramParkiran {
    static Parkiran parkiran = new Parkiran(100);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Input data");
            System.out.println("2. Cari data");
            System.out.println("3. Lihat data");
            System.out.println("4. Laporan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();
            
            switch (pilihan) {
                case 1:
                    inputData();
                    break;
                case 2:
                    cariDataPlat();
                    break;
                case 3:
                    parkiran.displayInfoParkirDescending();
                    break;
                case 4:
                    laporanPendapatan();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
                    break;
            }
        } while (pilihan != 0);

        scanner.close();
    }

    public static void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tipe kendaraan (mobil/motor): ");
        String tipeKendaraan = scanner.nextLine();
        System.out.print("Plat nomor: ");
        String platNomor = scanner.nextLine();
        System.out.print("Durasi: ");
        int durasi = scanner.nextInt();
        Kendaraan kendaraan = new Kendaraan(tipeKendaraan, platNomor, durasi);
        parkiran.tambah(kendaraan);
    }

    public static void cariDataPlat( ) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nomor plat: ");
        String platCari = scanner.nextLine();
        Kendaraan[] hasilCari = parkiran.binarySearchByPlat(platCari);
        if (hasilCari.length > 0) {
            System.out.println("\nData ditemukan:");
            for (Kendaraan k : hasilCari) {
                System.out.println("Tipe: " + k.getTipe() + ", No Plat: " + k.getPlat() + ", Durasi: " + k.getDurasi() + " jam, Biaya: " + k.getBiaya());
            }
        } else {
            System.out.println("\n! Data tidak ditemukan !");
        }
    }

    public static void laporanPendapatan() {
        int totalMobil = 0;
        int totalMotor = 0;
        for (int i = 0; i < parkiran.index; i++) {
            switch (parkiran.daftarKendaraan[i].getTipe()) {
                case "mobil":
                    totalMobil += parkiran.daftarKendaraan[i].getBiaya();
                    break;
                case "motor":
                    totalMotor += parkiran.daftarKendaraan[i].getBiaya();
                    break;
            }
        }
        System.out.println("\nTotal pendapatan:");
        System.out.println("Mobil: " + totalMobil);
        System.out.println("Motor: " + totalMotor);
    }
}