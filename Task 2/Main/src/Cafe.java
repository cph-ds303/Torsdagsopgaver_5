import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// 2.c Vi opretter en Cafe klasse, som har en String ArrayList, som kan indeholde alle kaffetyper på menuen i text form.
public class Cafe {
    private ArrayList<String> coffeeMenu = new ArrayList<>();

    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }

    /* 2.c Vi laver en metode loadMenuData, som skal tage data fra coffees.txt som ligger rooted i vores project
     scannern skal læse indholdet i coffee.txt indtil der ikke er mere text at læse */

    public void loadMenuData() {

        // 2.d checked exception
        try {
            File file = new File("coffees.txt");
            Scanner scan = new Scanner(file);

            // While loop som scanner igennem linjerne i filen og returner true, hvis filen har endnu en linje tilgængelig
            while (scan.hasNextLine()) {

                // Læser den næste linje fra filen, og gemmer data i ArrayListen fra coffeeMenu
                coffeeMenu.add(scan.nextLine());
            }
            scan.close(); // Scanner lukkes når opgaven er løst
        } catch (FileNotFoundException e) {
            System.out.println("Fil ikke fundet");
        }
    }
}
