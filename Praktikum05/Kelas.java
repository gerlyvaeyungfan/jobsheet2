public class Kelas {
    public Mahasiswa[] daftarMahasiswa;
    public int index;
    
    public Kelas(int capacity) {
        daftarMahasiswa = new Mahasiswa[capacity];
        index = 0;
    }

    public void add(Mahasiswa mahasiswa) {
        if (index < daftarMahasiswa.length) {
            daftarMahasiswa[index++] = mahasiswa;
        } else {
            System.out.println("Kelas sudah penuh");
        }
    }

    public void bubbleSortByIPK() {
        System.out.println("\nBubbleSortByIPK");
        System.out.println("-----------------------------");
        int n = daftarMahasiswa.length;
        for (int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++){
                if(daftarMahasiswa[j].ipk > daftarMahasiswa[j + 1].ipk){
                    Mahasiswa temp = daftarMahasiswa[j];
                    daftarMahasiswa[j] = daftarMahasiswa[j + 1];
                    daftarMahasiswa[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSortByUmur() {
        System.out.println("\nSelectionSortByUmur");
        System.out.println("-----------------------------");
        int n = daftarMahasiswa.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (daftarMahasiswa[j].umur < daftarMahasiswa[minIndex].umur) {
                    minIndex = j;
                }
            }
            Mahasiswa temp = daftarMahasiswa[minIndex];
            daftarMahasiswa[minIndex] = daftarMahasiswa[i];
            daftarMahasiswa[i] = temp;
        }
    }

    public void insertionSortByIPKDesc() {
        System.out.println("\nInsertionSortByIPKDesc");
        System.out.println("-----------------------------");
        int n = daftarMahasiswa.length;

        for(int i = 1; i < n ; i++) {
            Mahasiswa key = daftarMahasiswa[i];
            int j = i - 1;

            while(j >= 0 && daftarMahasiswa[j].ipk < key.ipk) {
                daftarMahasiswa[j + 1] = daftarMahasiswa[j];
                j = j - 1;
            }
            daftarMahasiswa[j + 1] = key;
        }
    }
    

    public void displayInfo() {
        for (int i = 0; i < index; i++) {
            daftarMahasiswa[i].displayInfo();
        }
        System.out.println();
    }

    public Mahasiswa sequentialSearchByNama(String keyword) {
        System.out.println("\nSequentialSearchByNama");
        System.out.println("-----------------------------");
        for (int i = 0; i < index; i++) {
            if (daftarMahasiswa[i].getNama().toLowerCase().contains(keyword.toLowerCase())) {
                return daftarMahasiswa[i];
            }
        }
        return null;
    }

    public Mahasiswa[] binarySearchByUmur(int umur) {
        System.out.println("\nBinarySearchByUmur");
        System.out.println("-----------------------------");
        
        int count = 0;
        for (int i = 0; i < index; i++) {
            if (daftarMahasiswa[i].getUmur() == umur) {
                count++;
            }
        }
        
        Mahasiswa[] result = new Mahasiswa[count];
        int resultIndex = 0;

        for (int i = 0; i < index; i++) {
            if (daftarMahasiswa[i].getUmur() == umur) {
                result[resultIndex] = daftarMahasiswa[i];
                resultIndex++;
            }
        }

        if (resultIndex == 0) {
            System.out.println("Tidak ada mahasiswa dengan umur " + umur);
        }
        
        return result;
    }
}