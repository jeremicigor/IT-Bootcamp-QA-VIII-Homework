package domaci11;

import java.util.Scanner;

public class Zadatak2 {

    /*
    2.	Pomocu while petlje, korisnik neprestano unosi brojeve i oni se sabiraju.
    Kada korisnik upise 0, program ispisuje sumu prethodno unetih brojeva i program se zavrsava.
     */

    public static void main(String[] args) {

        System.out.println("Unesi neki broj: ");
        Scanner sc = new Scanner(System.in);
        double i = sc.nextDouble();
        double sum = 0;

        //koristih double jer korisnik nije ogranicen na unos celobrojnih vrednosti

        while (i!=0){
            sum=sum+i;
            System.out.println("Unesi jos jedan broj: ");
            i = sc.nextDouble();
        }
        System.out.println("Zbir svih unetih brojeva pre nule je: " + sum);

        sc.close();
    }
}
