public class TravelPlatform {
    Hotel[] daftarHotel;
    int index;

    public TravelPlatform(int kapasitas) {
        daftarHotel = new Hotel[kapasitas];
        index = 0;
    }

    public void tambahHotel(Hotel hotel) {
        if (index < daftarHotel.length) {
            daftarHotel[index] = hotel;
            index++;
        } else {
            System.out.println("Kapasitas hotel sudah penuh.");
        }
    }

    public void bubbleSortByHarga() {
        int n = index;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (daftarHotel[j].getHarga() > daftarHotel[j + 1].getHarga()) {
                    Hotel temp = daftarHotel[j];
                    daftarHotel[j] = daftarHotel[j + 1];
                    daftarHotel[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSortByRating() {
        int n = index;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (daftarHotel[j].getRating() > daftarHotel[maxIndex].getRating()) {
                    maxIndex = j;
                }
            }
            Hotel temp = daftarHotel[maxIndex];
            daftarHotel[maxIndex] = daftarHotel[i];
            daftarHotel[i] = temp;
        }
    }

    public void tampilkanDaftarHotel() {
        for (int i = 0; i < index; i++) {
            System.out.println("Nama Hotel: " + daftarHotel[i].getNama());
            System.out.println("Harga: " + daftarHotel[i].getHarga());
            System.out.println("Rating: " + daftarHotel[i].getRating() + " bintang");
            System.out.println();
        }
    }
}