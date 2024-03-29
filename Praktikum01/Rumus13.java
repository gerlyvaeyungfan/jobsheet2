import java.util.Scanner;

public class Rumus13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rumus[] = {"Rumus Kecepatan", "Rumus Jarak", "Rumus Waktu"};
        int hasil;

        boolean menu = true;
        while (menu) {
            do {
                System.out.println("======================");
                System.out.println("Program Hitung");
                for (int i = 0; i < rumus.length; i++) {
                    System.out.println((i+1)+". " + rumus[i]);
                }
                System.out.println("4. Exit");
                System.out.print("Pilih angka 1/2/3/4: ");
                hasil = sc.nextInt();
                System.out.println("======================");
                if (hasil < 1 || hasil > 4) {
                    System.out.println("\n! Mohon masukkan nomor antara 1 dan 4 !");
                }
                switch (hasil) {
                    case 1:
                        hitungKecepatan();
                        menu=true;
                        break;
                    case 2:
                        hitungJarak();
                        menu=true;
                        break;
                    case 3:
                        hitungWaktu();
                        menu=true;
                        break;
                    case 4:
                        System.exit(0);
                }
            } while (hasil < 1 || hasil > 4);
        }
    }

    static void hitungKecepatan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jarak: ");
        Double inputJarak = sc.nextDouble();
        System.out.print("Masukkan waktu: ");
        Double inputWaktu = sc.nextDouble();
        Double hasilKecepatan = inputJarak/inputWaktu;
        System.out.println("Total Kecepatan : " + hasilKecepatan);
    }

    static void hitungJarak(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kecepatan: ");
        Double inputKecepatan = sc.nextDouble();
        System.out.print("Masukkan waktu: ");
        Double inputWaktu = sc.nextDouble();
        Double hasilJarak = inputKecepatan*inputWaktu;
        System.out.println("Total Jarak : " + hasilJarak);
    }

    static void hitungWaktu(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jarak: ");
        Double inputJarak = sc.nextDouble();
        System.out.print("Masukkan kecepatan: ");
        Double inputKecepatan = sc.nextDouble();
        Double hasilWaktu = inputJarak/inputKecepatan;
        System.out.println("Total Waktu : " + hasilWaktu);
    }

}
