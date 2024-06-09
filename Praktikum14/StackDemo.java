import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Book book1 = new Book("1234", "Dasar Pemrograman");
        Book book2 = new Book("7145", "Hafalan Shalat Delisa");
        Book book3 = new Book("3562", "Muhammad Al-Fatih");

        Stack<Book> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        System.out.println("\nStack dari tumpukan paling bawah:");
        for (Book book : books) {
            System.out.println(book.toString());
        }

        Book temp = books.peek();
        if (temp != null) {
            System.out.println("\nBuku yang Paling atas(peek) adalah:");
            System.out.println(temp.toString());
        }

        Book temp2 = books.pop();
        if (temp2 != null) {
            System.out.println("\nIsi Stack yang dihapus(pop) adalah:");
            System.out.println(temp2.toString());
        }

        System.out.println("\nBuku yang berada pada Stack sekarang:");
        for (Book book : books) {
            System.out.println(book.toString());
        }

        System.out.println("\nBuku yang berada pada Stack sekarang:");
        System.out.println(books);

        int position = books.search(book2);
        if (position != -1) {
            System.out.println("\nBuku ditemukan pada posisi: ke-" + position);
        } else {
            System.out.println("Buku tidak ditemukan.");
        }
    }
}
