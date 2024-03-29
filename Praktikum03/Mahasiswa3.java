public class Mahasiswa3{
    public String nama;
    public String nim;
    public char jenisKelamin;
    public double ipk;

    public Mahasiswa3(String nama, String nim, char jenisKelamin, double ipk){
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }
    public void tampilkanInfo(){
        System.out.println("Nama          : " + nama);
        System.out.println("NIM           : " + nim);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("IPK           : " + ipk);
    }
    
    public double getIpk(){
        return ipk;
    }
}


