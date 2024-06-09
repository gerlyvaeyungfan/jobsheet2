import java.util.ArrayList;
import java.util.Collections;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>(2);

        Customer customer1 = new Customer(1, "Zakia");
        Customer customer2 = new Customer(5, "Budi");

        customers.add(customer1);
        customers.add(customer2);

        customers.add(new Customer(4, "Cica"));
        customers.add(new Customer(100, "Rosa"));

        System.out.println("Customer 2 berada pada indeks ke-"+customers.indexOf(customer2));

        Customer customer = customers.get(2);
        System.out.println("nama indeks ke-2 adalah " + customer.name);
        customer.name = "Budi Utomo";//mengubah nama pada indeks ke-2 menjadi Budi Utomo

        ArrayList<Customer> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer(201, "Della"));
        newCustomers.add(new Customer(201, "Victor"));
        newCustomers.add(new Customer(201, "Sarah"));
        
        customers.addAll(newCustomers);

        for (Customer cust : customers) {
            System.out.println(cust.toString());
        }

        System.out.println(customers);
        
        System.out.println("\nSorting Berdasarkan Collection of Object:");
        ArrayList<Customer> daftarCustomers = new ArrayList<>();
        
        daftarCustomers.add(new Customer(37, "Gaby"));
        daftarCustomers.add(new Customer(33, "Corta"));
        daftarCustomers.add(new Customer(34, "Angela"));
        
        daftarCustomers.sort((c1, c2)->c1.name.compareTo(c2.name));
        System.out.println(daftarCustomers);

        ArrayList<String> daftarCoba = new ArrayList<>();
        daftarCoba.add("Meisy");
        daftarCoba.add("Aqila");
        daftarCoba.add("Gerly");
        Collections.sort(daftarCoba);
        System.out.println("\nSorting Berdasarkan Tipe Data Primitive(String):");
        System.out.println(daftarCoba);

    }
}
