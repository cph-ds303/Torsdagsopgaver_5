import java.util.ArrayList;

// 1.e Vi laver vores main klasse med main metode
public class Main {

    public static void main(String[] args) {

        // 1.e her opretter vi vores "beholder" til at indeholde vores customers
        ArrayList<Customer> customers = new ArrayList<>();

        customers.add (new Customer(" Dino ", " Saldic ", " ds303"));
        customers.add (new Customer(" Bob ",  " Marley ", " bm062"));
        customers.add (new Customer(" Erykah",  " Badu ", " 262"));
        customers.add (new Customer(" Aoife",  " DeFaoite ", " 087"));


        printCustomers(customers);
    }

        // 1.f her laver vi en static metode, hvor vi printer alle customers ud vha. et for each loop. Vi kalder derefter metoden i main.
        public static void printCustomers (ArrayList<Customer> customers){

        for (Customer c: customers){

            System.out.println(c);
        }
    }

}
