import java.util.Scanner;

public class KlinikDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas antrian: ");
        int kapasitas = sc.nextInt();
        sc.nextLine();
        
        QueueP antrianKlinik = new QueueP(kapasitas);
        int menu;
        
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Hapus Pasien Terdepan");
            System.out.println("3. Tampilkan Daftar Pasien");
            System.out.println("4. Tampilkan Pasien Terdepan");
            System.out.println("5. Tampilkan Pasien Terbelakang");
            System.out.println("6. Cek Posisi Pasien dalam Antrian");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();
            
            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama pasien: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan nomor ID: ");
                    String noID = sc.nextLine();
                    System.out.print("Masukkan jenis kelamin (L/P): ");
                    char jenisKelamin = sc.nextLine().charAt(0);
                    Pasien newPasien = new Pasien(nama, noID, jenisKelamin);
                    antrianKlinik.enqueueP(newPasien);
                    break;
                case 2:
                    int dequeuedIndex = antrianKlinik.dequeueP();
                    if (dequeuedIndex != -1) {
                        System.out.println("Pasien terdepan telah dihapus dari antrian.");
                    }
                    break;
                case 3:
                    antrianKlinik.printP();
                    break;
                case 4:
                    antrianKlinik.peekP();
                    break;
                case 5:
                    antrianKlinik.peekRearP();
                    break;
                case 6:
                    System.out.print("Masukkan nama pasien yang ingin dicek posisinya: ");
                    String namaPasien = sc.nextLine();
                    antrianKlinik.peekPositionP(namaPasien);
                    break;
                case 7:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
                    break;
            }
        } while (menu != 7);
        
        sc.close();
    }
}
