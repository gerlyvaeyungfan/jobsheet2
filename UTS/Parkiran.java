public class Parkiran {
    public KendaraanU[] daftarKendaraan;
    public int index;

    public Parkiran(int kapasitas) {
        daftarKendaraan = new KendaraanU[kapasitas];
        index = 0;
    }

    public void tambah(KendaraanU kendaraan) {
        if (index < daftarKendaraan.length) {
            daftarKendaraan[index++] = kendaraan;
        } else {
            System.out.println("\n! Parkiran penuh !");
        }
    }

    public KendaraanU[] binarySearchByPlat(String plat) {
        KendaraanU[] tempResult = new KendaraanU[index];
        int resultIndex = 0;
        for (int i = 0; i < index; i++) {
            if (daftarKendaraan[i].getPlatU().toLowerCase().contains(plat.toLowerCase())) {
                tempResult[resultIndex++] = daftarKendaraan[i];
            }
        }
        KendaraanU[] result = new KendaraanU[resultIndex];
        for (int i = 0; i < resultIndex; i++) {
            result[i] = tempResult[i];
        }
        return result;
    }

    public void displayInfoParkir() {
        for (int i = 0; i < index; i++) {
            System.out.println("Tipe: " + daftarKendaraan[i].getTipeU() + ", No Plat: " +
            daftarKendaraan[i].getPlatU() + ", Durasi: " + daftarKendaraan[i].getDurasiU() +
            " jam, Biaya: " + daftarKendaraan[i].getBiayaU());
        }
    }

    public void displayInfoParkirDescending() {
        if (index == 0) {
            System.out.println("\n! Belum ada kendaraan yang parkir !");
        } else {
            System.out.println("\nData parkiran:");
            for (int i = 0; i < index - 1; i++) {
                for (int j = 0; j < index - i - 1; j++) {
                    if (daftarKendaraan[j].getBiayaU() < daftarKendaraan[j + 1].getBiayaU()) {
                        KendaraanU temp = daftarKendaraan[j];
                        daftarKendaraan[j] = daftarKendaraan[j + 1];
                        daftarKendaraan[j + 1] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < index; i++) {
            System.out.println("Tipe: " + daftarKendaraan[i].getTipeU() + ", No Plat: " +
            daftarKendaraan[i].getPlatU() + ", Durasi: " + daftarKendaraan[i].getDurasiU() +
            " jam, Biaya: " + daftarKendaraan[i].getBiayaU());
        }
    }
}