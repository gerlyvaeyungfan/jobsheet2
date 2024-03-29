public class Demo {
    public static void main(String[] args) {
        Kelas kelas1A = new Kelas(5);
        Mahasiswa mhs1 = new Mahasiswa("Ani", 18, 4.00);
        Mahasiswa mhs2 = new Mahasiswa("Budi", 19, 3.50);
        Mahasiswa mhs3 = new Mahasiswa("Cica", 17, 3.75);
        Mahasiswa mhs4 = new Mahasiswa("Deni", 20, 3.15);
        Mahasiswa mhs5 = new Mahasiswa("Eka", 18, 3.00);

        kelas1A.add(mhs1);
        kelas1A.add(mhs2);
        kelas1A.add(mhs3);
        kelas1A.add(mhs4);
        kelas1A.add(mhs5);

        kelas1A.bubbleSortByIPK();
        kelas1A.displayInfo();
        kelas1A.selectionSortByUmur();
        kelas1A.displayInfo();
        kelas1A.insertionSortByIPKDesc();
        kelas1A.displayInfo();
        
        Mahasiswa resultSequentialSearch = kelas1A.sequentialSearchByNama("di");
        if (resultSequentialSearch != null) {
            System.out.println("Mahasiswa ditemukan berdasarkan nama (di): " + resultSequentialSearch.getNama());
        } else {
            System.out.println("Mahasiswa tidak ditemukan berdasarkan nama");
        }

        Mahasiswa[] resultBinarySearch = kelas1A.binarySearchByUmur(18);
        if (resultBinarySearch.length > 0) {
            System.out.print("Mahasiswa ditemukan berdasarkan umur (18): ");
            for (Mahasiswa mahasiswa : resultBinarySearch) {
                System.out.print(mahasiswa.getNama());
                System.out.print(" ");
            }
        } else {
            System.out.println("Mahasiswa tidak ditemukan berdasarkan umur");
        }
    }
}

