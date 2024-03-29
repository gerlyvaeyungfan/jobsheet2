public class Barang {
    public String namaBarang;
     public int jumlahBarang;

    public Barang(String namaBarang, int jumlahBarang) {
        this.namaBarang = namaBarang;
        this.jumlahBarang = jumlahBarang;
    }

    public void menampilkanNamaBarang() {
        System.out.println("Nama Barang: " + namaBarang);
    }

    public void menampilkanJumlahBarang() {
        System.out.println("Jumlah Barang: " + jumlahBarang);
    }

    public void menambahStokBarang(int tambahan) {
        jumlahBarang += tambahan;
        System.out.println("Stok barang " + namaBarang + " bertambah menjadi " + jumlahBarang);
    }
}


