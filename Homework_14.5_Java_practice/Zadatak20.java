package ZadaciZaVezbanje;

import java.util.Scanner;

public class Zadatak20 {

    /*
    20.	Kreirati metodu koja računa proizvod dva broja, vraća rezultat u main, duplira i ispisuje.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesi prvi broj: ");
        int a = sc.nextInt();
        System.out.print("Unesi drugi broj: ");
        int b = sc.nextInt();

        int c = 2* (proizvod(a,b));
        System.out.println("Dupla vrednost proizvoda ova dva broja je: " + c);

    }
    public static int proizvod (int cinilac1, int cinilac2){
        return cinilac1*cinilac2;
    }
}
