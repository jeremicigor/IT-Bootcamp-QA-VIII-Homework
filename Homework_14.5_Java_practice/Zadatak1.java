package ZadaciZaVezbanje;

import java.util.Scanner;

public class Zadatak1 {
    /*
    1.	Napisati program za odredjivanje apsolutne vrednosti broja koji unesete sa tastature.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi broj: ");
        int broj = sc.nextInt();
        int brojAbs = Math.abs(broj);
        System.out.println(brojAbs);
        sc.close();
    }
}
