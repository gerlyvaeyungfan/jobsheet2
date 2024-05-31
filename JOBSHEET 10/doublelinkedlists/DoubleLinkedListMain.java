package doublelinkedlists;

public class DoubleLinkedListMain {
    public static void main(String[] args) {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("====================================");

        dll.addFirst(3);
        dll.addFirst(4);
        dll.addFirst(7);

        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("====================================");

        try {
            dll.add(40, 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=====================================");

        dll.clear();
        dll.print();
        System.out.println("Size : " + dll.size());

        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("====================================");

        try {
            dll.removeFirst();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("====================================");

        try {
            dll.removeLast();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("====================================");

        try {
            dll.remove(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("====================================");

        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("====================================");

        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);

        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("====================================");
        try {
            dll.add(40, 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        dll.print();
        try {
            System.out.println("Data awal pada Linked List adalah: " + dll.getFirst());
            System.out.println("Data akhir pada Linked List adalah: " + dll.getLast());
            System.out.println("Data indeks ke-1 pada Linked Lists adalah: " + dll.get(1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}