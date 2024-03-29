public class Piramid {
    private float alasPersegi;
    private float tinggi;

    public Piramid(float alasPersegi, float tinggi){
        this.alasPersegi = alasPersegi;
        this.tinggi = tinggi;
    }

    public void hitungVolume(){
        float volume = (float) (1.0/5.0) * alasPersegi * this.tinggi;
        System.out.println("Volume Piramid yaitu : " + volume);
    }
}