public class Hotel {
    String nama;
    double harga;
    int rating;

    public Hotel(String nama, double harga, int rating) {
        this.nama = nama;
        this.harga = harga;
        this.rating = rating;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getRating() {
        return rating;
    }
}