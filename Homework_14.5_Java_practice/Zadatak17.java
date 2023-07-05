package ZadaciZaVezbanje;

import java.util.Scanner;

public class Zadatak17 {

    /*
    17.	Napisati program koji ce učitati elemente i naći najveći element niza.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesi duzinu niza: ");
        int duzinaNiza = sc.nextInt();
        int[] niz = new int[duzinaNiza];

        for (int i=0; i<duzinaNiza; i++){
            System.out.print("Unesi " + (i+1) + ". element niza: ");
            niz[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i<niz.length; i++){
            if (max<niz[i]){
                max=niz[i];
            }
        }
        System.out.println("Najveci element niza je: " + max);


        sc.close();

    }
}
