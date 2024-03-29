public class HotelMain {
    public static void main(String[] args) {
        TravelPlatform platform = new TravelPlatform(5);

        // Menambahkan data hotel
        platform.tambahHotel(new Hotel("Hotel A", 70.0, 2));
        platform.tambahHotel(new Hotel("Hotel B", 90.0, 4));
        platform.tambahHotel(new Hotel("Hotel C", 100.0, 5));
        platform.tambahHotel(new Hotel("Hotel D", 120.0, 5));
        platform.tambahHotel(new Hotel("Hotel E", 80.0, 3));

        platform.bubbleSortByHarga();
        System.out.println("Daftar Hotel berdasarkan Harga:");
        platform.tampilkanDaftarHotel();

        platform.selectionSortByRating();
        System.out.println("Daftar Hotel berdasarkan Rating:");
        platform.tampilkanDaftarHotel();
    }
}
