
public class Customer {

    // 1.a Her har vi oprettet en "Customer" class, med følgende "private" attributter
    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter = 1; // Her har jeg givet counters startværdi, så den første bruger starter med 1 i listen.

    // 1.b Her laver vi så en konstruktør "Customer" som tager kundens navn og brugernavn som parametre
    public Customer (String firstName, String lastName, String username){

        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;

        // 1.c vi sætter counter til at stige med 1 hver gang den bliver kaldt i konstruktøren. Her er det også vigtigt at vi fordeler en værdi til counter.
        this.id = counter;
        counter++;


    }

    // 1.d Her tilføjer vi setters og getters til alle vores attributter, på nær counter, eftersom vi har initialiseret den med id.
    public String getFirstName(){

        return firstName;
    }

    public void setFirstName (String firstName){

        this.firstName = firstName;
    }

    public String getLastName (){

        return lastName;
    }

    public void setLastName(String lastName){

        this.lastName = lastName;
    }

    public String getUsername (){

        return username;
    }

    public void setUsername (String username){

        this.username = username;
    }

    public int getId (){

        return id;
    }


    @Override

    public String toString(){

        return id + firstName + lastName + username;
    }

}
