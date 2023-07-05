package ZadaciZaVezbanje;

import java.util.Scanner;

public class Zadatak9 {

    /*
9.	Napisati program koji ce učitati sa tastature visine za n osoba. Ispisati prosečnu i najveću visinu.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        double sumVisina = 0;
        double najvecaVisina = 0;


        for (int i = 0; i<n; i++){
            System.out.print("Unesi " + (i+1) + ". visinu u cm: ");
            double visina = sc.nextDouble();
            sumVisina += visina;
            if (visina>=najvecaVisina){
                najvecaVisina = visina;
            }
        }

        System.out.println("Prosecna visina je: " + (sumVisina/n) + ". Najveca visina je: " + najvecaVisina);
    }
}
