public class Kendaraan {
    public String noPlat, noKartu;
    public double saldo;

    public Kendaraan(String noPlat, String noKartu, double saldo) {
        this.noPlat = noPlat;
        this.noKartu = noKartu;
        this.saldo = saldo;
    }

    public String toString() {
        return "No Plat: " + noPlat + ", No Kartu: " + noKartu + ", Saldo: " + saldo;
    }
}