package ZadaciZaVezbanje;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak16 {

    /*
    16.	Napisati program koji ce učitati elemente niza i ispisati elemente niza u obrnutom redosledu.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi duzinu niza: ");
        int duzinaNiza = sc.nextInt();

        int [] niz = new int [duzinaNiza];
      //  System.out.println(Arrays.toString(niz));
        for (int i = 0; i<niz.length; i++){
            System.out.println("Unesi element niza: ");
            niz[i] = sc.nextInt();
        }

        for (int i = duzinaNiza-1; i>=0; i--){
            System.out.print(niz[i] + " ");
        }
        sc.close();

    }
}
