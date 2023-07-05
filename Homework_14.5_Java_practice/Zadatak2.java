package ZadaciZaVezbanje;

import java.util.Scanner;

public class Zadatak2 {

    /*
    2.	Napisati program koji od dva učitana broja (a, b) sa tastature nalazi veći.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesi prvi broj: ");
        double a = sc.nextDouble();
        System.out.print("Unesi drugi broj: ");
        double b = sc.nextDouble();
        System.out.println("Najveci broj je: " + Math.max(a,b));
        sc.close();
    }
}
