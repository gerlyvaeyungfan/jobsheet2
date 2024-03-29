import java.util.Scanner;
public class BarangDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah barang : ");
        int jumlahBarang = sc.nextInt();

        Barang[] stokBarang = new Barang[jumlahBarang];

        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println("\nData barang ke-" + (i + 1));
            System.out.print("Nama barang   : ");
            String namaBarang = sc.next();
            System.out.print("Jumlah barang : ");
            int jumlah = sc.nextInt();

            stokBarang[i] = new Barang(namaBarang, jumlah);
        }
        System.out.println("\nData Barang:");
        for (Barang barang : stokBarang) {
            barang.menampilkanNamaBarang();
            barang.menampilkanJumlahBarang();
        }
        // Tambah stok barang
        System.out.print("\nMasukkan nama barang yang ingin ditambah stoknya: ");
        String barangTambah = sc.next();
        System.out.print("Masukkan jumlah tambahan stok : ");
        int tambahan = sc.nextInt();

        for (Barang barang : stokBarang) {
            if (barang.namaBarang.equalsIgnoreCase(barangTambah)) {
                barang.menambahStokBarang(tambahan);
                break;
            }
        }
    }
}


