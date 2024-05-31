public class Kendaraan {
    private String tipe;
    private String plat;
    private int durasi;
    private int biaya;

    public Kendaraan(String tipe, String plat, int durasi) {
        this.tipe = tipe;
        this.plat = plat;
        this.durasi = durasi;
        switch (tipe) {
            case "mobil":
                biaya = durasi * 3000;
                break;
            case "motor":
                biaya = durasi * 1000;
                break;
        }
    }

    public String getTipe() {
        return tipe;
    }

    public String getPlat() {
        return plat;
    }

    public int getDurasi() {
        return durasi;
    }

    public int getBiaya() {
        return biaya;
    }
}