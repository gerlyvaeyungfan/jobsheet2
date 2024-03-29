public class Sorting {
    public static void sequentialSearch(int[] arr, int key) {
        boolean found = false;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Data " + key + " ditemukan pada indeks ke-" + index);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    public static int binarySearch(int[] arr, int key) {
        if (arr[0] < arr[arr.length - 1]) {
            return binarySearchAsc(arr, key);
        }
        else if (arr[0] > arr[arr.length - 1]) {
            return binarySearchDesc(arr, key);
        }
        else {
            return -1;
        }
    }

    public static int binarySearchAsc(int[] arr, int key) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearchDesc(int[] arr, int key) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] daftarNilai = {10, 5, 20, 15, 5, 45};
        sequentialSearch(daftarNilai, 5);

        int[] sortedNilaiAsc = {5, 5, 10, 20, 30, 40, 50};
        int[] sortedNilaiDesc = {50, 40, 30, 20, 10, 5, 5};
        int[] sortedNilai = {50, 40, 30, 20, 10, 5, 5};
        
        int key = 5;

        int index = binarySearch(sortedNilai, key);
        if (index != -1) {
            System.out.println("Data ditemukan pada indeks ke-" + index + " (binary search)");
        } else {
            System.out.println("Data tidak ditemukan (desc)");
        }

        index = binarySearch(sortedNilaiAsc, key);
        if (index != -1) {
            System.out.println("Data ditemukan pada indeks ke-" + index + " (asc)");
        } else {
            System.out.println("Data tidak ditemukan (asc)");
        }

        index = binarySearch(sortedNilaiDesc, key);
        if (index != -1) {
            System.out.println("Data ditemukan pada indeks ke-" + index + " (desc)");
        } else {
            System.out.println("Data tidak ditemukan (desc)");
        }
        
    }
}
