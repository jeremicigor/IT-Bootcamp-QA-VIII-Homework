package ZadaciZaVezbanje;

import java.util.Scanner;

public class Zadatak19 {

    /*
    19.	Napisati metod za nalaženje minimuma od dva učitana broja (a, b) sa tastature.
    Izvršiti dodeljivanje vrednosti metoda varijabli c.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesi prvi broj: ");
        int a = sc.nextInt();
        System.out.print("Unesi drugi broj: ");
        int b = sc.nextInt();

        int c = minFinder(a,b);
        System.out.println(c);

    }
    public static int minFinder (int a, int b){
        return Math.min(a,b);
    }
}
