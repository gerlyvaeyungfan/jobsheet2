public class Pasien {
    public String nama, noID;
    public char jenisKelamin;

    public Pasien(String nama, String noID, char jenisKelamin) {
        this.nama = nama;
        this.noID = noID;
        this.jenisKelamin = jenisKelamin;
    }

    public String toString() {
        return "Nama: " + nama + ", No. ID: " + noID + ", Jenis Kelamin: " + jenisKelamin;
    }
}