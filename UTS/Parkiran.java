public class Parkiran {
    public Kendaraan[] daftarKendaraan;
    public int index;

    public Parkiran(int kapasitas) {
        daftarKendaraan = new Kendaraan[kapasitas];
        index = 0;
    }

    public void tambah(Kendaraan kendaraan) {
        if (index < daftarKendaraan.length) {
            daftarKendaraan[index++] = kendaraan;
        } else {
            System.out.println("\n! Parkiran penuh !");
        }
    }

    public Kendaraan[] binarySearchByPlat(String plat) {
        Kendaraan[] tempResult = new Kendaraan[index];
        int resultIndex = 0;
        for (int i = 0; i < index; i++) {
            if (daftarKendaraan[i].getPlat().toLowerCase().contains(plat.toLowerCase())) {
                tempResult[resultIndex++] = daftarKendaraan[i];
            }
        }
        Kendaraan[] result = new Kendaraan[resultIndex];
        for (int i = 0; i < resultIndex; i++) {
            result[i] = tempResult[i];
        }
        return result;
    }

    public void displayInfoParkir() {
        for (int i = 0; i < index; i++) {
            System.out.println("Tipe: " + daftarKendaraan[i].getTipe() + ", No Plat: " + daftarKendaraan[i].getPlat() + ", Durasi: " + daftarKendaraan[i].getDurasi() + " jam, Biaya: " + daftarKendaraan[i].getBiaya());
        }
    }

    public void displayInfoParkirDescending() {
        if (index == 0) {
            System.out.println("\n! Belum ada kendaraan yang parkir !");
        } else {
            System.out.println("\nData parkiran:");
            for (int i = 0; i < index - 1; i++) {
                for (int j = 0; j < index - i - 1; j++) {
                    if (daftarKendaraan[j].getBiaya() < daftarKendaraan[j + 1].getBiaya()) {
                        Kendaraan temp = daftarKendaraan[j];
                        daftarKendaraan[j] = daftarKendaraan[j + 1];
                        daftarKendaraan[j + 1] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < index; i++) {
            System.out.println("Tipe: " + daftarKendaraan[i].getTipe() + ", No Plat: " + daftarKendaraan[i].getPlat() + ", Durasi: " + daftarKendaraan[i].getDurasi() + " jam, Biaya: " + daftarKendaraan[i].getBiaya());
        }
    }
}