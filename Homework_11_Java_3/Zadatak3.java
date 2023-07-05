package domaci11;

import java.util.Scanner;

public class Zadatak3 {

    /*
    3.	Sa do while petljom uraditi sumu brojeva koje korisnik unese.
    Minimum jedan broj mora da se unese (to do while svakako obezbedjuje).
    Program ispisuje koja je suma kada upisete 0 ili negativan broj
     */

    public static void main(String[] args) {

        System.out.println("Unesi neki broj: ");
        Scanner sc = new Scanner(System.in);
        double i = sc.nextDouble();
        double sum = 0;

        //koristih double jer korisnik nije ogranicen na unos celobrojnih vrednosti

        do {
            sum = sum + i;
            System.out.println("Unesi jos neki broj: ");
            i = sc.nextDouble();
                } while (i>0);

        System.out.println("Zbir svih unetih pozitivnih brojeva je: " + sum);

        sc.close();
    }
}
