import java.util.Scanner;

public class MahasiswaDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa3[] daftarMahasiswa = new Mahasiswa3[3];
        for(int i = 0; i < daftarMahasiswa.length; i++){
            System.out.println("\nMahasiswa ke-" + (i+1));
            System.out.print("nama                : ");
            String nama = sc.next();
            System.out.print("NIM                 : ");
            String nim = sc.next();
            System.out.print("Jenis Kelamin (L/P) : ");
            char jenisKelamin = sc.next().charAt(0);
            System.out.print("IPK                 : ");
            double ipk = sc.nextDouble();
            daftarMahasiswa[i] = new Mahasiswa3(nama, nim, jenisKelamin, ipk);
        }
        double totalIpk = 0;
        int counter = 0;
        System.out.println("\nDaftar Mahasiswa : ");
        for( Mahasiswa3 mahasiswa : daftarMahasiswa){
            System.out.println("Data Mahasiswa ke-" + (counter + 1));
            mahasiswa.tampilkanInfo();
            totalIpk += mahasiswa.getIpk();
            counter++;
        }
        double rataRataIpk = totalIpk / 3;
        System.out.println("\nRata-rata IPK : " + rataRataIpk);
    }  
}


