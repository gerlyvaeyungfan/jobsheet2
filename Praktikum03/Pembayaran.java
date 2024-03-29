public class Pembayaran {
    public String metodePembayaran;
    public String kodeVerifikasi;

    public Pembayaran(String metodePembayaran, String kodeVerifikasi) {
        this.metodePembayaran = metodePembayaran;
        this.kodeVerifikasi = kodeVerifikasi;
    }

    public void menampilkanMetodePembayaran() {
        System.out.println("Metode Pembayaran: " + metodePembayaran);
    }

    public void menampilkanKodeVerifikasi() {
        System.out.println("Kode Verifikasi: " + kodeVerifikasi);
    }
}


