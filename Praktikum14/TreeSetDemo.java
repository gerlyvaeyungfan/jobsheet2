import java.util.Collections;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> fruits = new TreeSet<>();
        fruits.add("Mangga");
        fruits.add("Apel");
        fruits.add("Jeruk");
        fruits.add("Jambu");

        for (String temp : fruits) {
            System.out.println(temp);
        }

        System.out.println("\nFirst: " + fruits.first());
        System.out.println("Last: " + fruits.last());

        fruits.remove("Jeruk");
        System.out.println("\nSetelah Remove " + fruits);

        fruits.pollFirst();
        System.out.println("\nSetelah poll first " + fruits);

        fruits.pollLast();
        System.out.println("Setelah poll last " + fruits);
        System.out.println("");
        
    }
}
