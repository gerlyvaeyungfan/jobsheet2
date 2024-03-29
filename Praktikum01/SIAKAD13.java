import java.util.Scanner;
import java.text.DecimalFormat;

public class SIAKAD13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] matkul = {"Agama", "Bahasa Indonesia",  "Bahasa Inggris", "Konsep Teknologi Informasi",
                "Critical Thinking and Problem Solving", "Pengantar Akuntansi, Manajemen, dan Bisnis", "Matematika Dasar",
                "Dasar Pemrogramman", "Praktikum Dasar Pemrogramman"};

        System.out.println("======================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("======================");

        int nilai[] = new int[9];
        double tampilNilai = 0.0;
        String huruf[] = {"A", "B+", "B", "C+", "C", "D", "E"};
        String tampilHuruf="";
        double bobot[] = {4, 3.5, 3, 2.5, 2, 1, 0};
        String tampilBobot = "";
        double totalNilaiIp = 0;
        DecimalFormat desimal = new DecimalFormat("#.##");
        double []sks = {2,2,2,2,2,2,2,2,3};
        double totalSks = 0;

        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + matkul[i] + ": ");
            nilai[i] = sc.nextInt();
        }

        System.out.println("======================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("======================");
        System.out.println("MK\t\t\t\t             Nilai Angka     Nilai Huruf     Bobot Nilai");

        for (int i = 0; i < matkul.length; i++) {
            if (80 < nilai[i] && nilai[i] <= 100) {
                tampilNilai = (double) nilai[i];
                tampilHuruf = huruf[0];
                for (int j = 0; j < 1; j++) {
                    String formatBobot = String.format("%.2f", bobot[j]);
                    tampilBobot=formatBobot;
                }
                totalSks += bobot[0]*sks[i];
            } else if (73 < nilai[i] && nilai[i] <= 80) {
                tampilNilai = (double) nilai[i];
                tampilHuruf = huruf[1];
                for (int j = 1; j < 2; j++) {
                    String formatBobot = String.format("%.2f", bobot[j]);
                    tampilBobot=formatBobot;
                }
                totalSks += bobot[1]*sks[i];
            } else if (65 < nilai[i] && nilai[i] <= 73) {
                tampilNilai = (double) nilai[i];
                tampilHuruf = huruf[2];
                for (int j = 2; j < 3; j++) {
                    String formatBobot = String.format("%.2f", bobot[j]);
                    tampilBobot=formatBobot;
                }
                totalSks += bobot[2]*sks[i];
            } else if (60 < nilai[i] && nilai[i] <= 65) {
                tampilNilai = (double) nilai[i];
                tampilHuruf = huruf[3];
                for (int j = 3; j < 4; j++) {
                    String formatBobot = String.format("%.2f", bobot[j]);
                    tampilBobot=formatBobot;
                }
                totalSks += bobot[3]*sks[i];
            } else if (50 < nilai[i] && nilai[i] <= 60) {
                tampilNilai = (double) nilai[i];
                tampilHuruf = huruf[4];
                for (int j = 4; j < 5; j++) {
                    String formatBobot = String.format("%.2f", bobot[j]);
                    tampilBobot=formatBobot;
                }
                totalSks += bobot[4]*sks[i];
            } else if (39 < nilai[i] && nilai[i] <= 50) {
                tampilNilai = (double) nilai[i];
                tampilHuruf = huruf[5];
                for (int j = 5; j < 6; j++) {
                    String formatBobot = String.format("%.2f", bobot[j]);
                    tampilBobot=formatBobot;
                }
                totalSks += bobot[5]*sks[i];
            } else if (nilai[i] <= 39) {
                tampilNilai = (double) nilai[i];
                tampilHuruf = huruf[6];
                for (int j = 6; j < 7; j++) {
                    String formatBobot = String.format("%.2f", bobot[j]);
                    tampilBobot=formatBobot;
                }
                totalSks += bobot[6]*sks[i];
            }

            System.out.printf("%-45s%-18.2f%-15s%-16s\n", matkul[i], tampilNilai, tampilHuruf, tampilBobot);
        }
        
        totalNilaiIp = totalSks/19;
        String formatIP = desimal.format(totalNilaiIp);
        System.out.println("======================");
        System.out.println("IP : "+ formatIP);
    }
}
