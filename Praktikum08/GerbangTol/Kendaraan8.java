public class Kendaraan8 {
    private String noPlat, noKartu;
    private double saldo;

    Kendaraan8(String noPlat, String noKartu, double saldo) {
        this.noPlat = noPlat;
        this.noKartu = noKartu;
        this.saldo = saldo;
    }

    public String toString() {
        return "No Plat: " + noPlat + ", No Kartu: " + noKartu + ", Saldo: " + saldo;
    }
}