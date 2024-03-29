public class Mahasiswa {
    public String nama;
    public double ipk;
    public int umur;

    public Mahasiswa(String nama, int umur, double ipk){
        this.nama = nama;
        this.umur = umur;
        this.ipk = ipk;
    }
    public void displayInfo(){
        System.out.println(nama + " (Umur : " + umur + " IPK : " + ipk + ")");
    }
    
    public String getNama(){
        return nama;
    }
    public int getUmur(){
        return umur;
    }
    public double getIpk(){
        return ipk;
    }
}