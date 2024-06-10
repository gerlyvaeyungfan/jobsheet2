public class KendaraanU {
    private String tipe;
    private String plat;
    private int durasi;
    private double biaya;

    public KendaraanU(String tipe, String plat, int durasi) {
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

    public String getTipeU() {
        return tipe;
    }

    public String getPlatU() {
        return plat;
    }

    public int getDurasiU() {
        return durasi;
    }

    public double getBiayaU() {
        return biaya;
    }
}