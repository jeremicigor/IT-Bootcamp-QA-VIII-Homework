package ZadaciZaVezbanje;

import java.util.Scanner;

public class Zadatak12 {

    /*
    12.	Napisati program koji ce ispisati parne prirodne brojeve od 1 do 25 unete sa tastature.
    Kada korisnik unese 25 zavrsava se program. (while petlja).
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int broj = 0;
        while (broj!=25){
            System.out.println("Unesi prirodan broj: ");
            broj = sc.nextInt();
                if (broj%2==0 && broj>=1){
                    System.out.println (broj);
                } else if  (broj>25){
                    System.out.println("Niste uneli odgovarajuc broj.");
                    } else {
                    System.out.println("Broj nije paran. Pokusaj ponovo");

                }
        }
    }
}
