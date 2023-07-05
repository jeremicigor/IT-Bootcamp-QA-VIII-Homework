package ZadaciZaVezbanje;

import java.util.Scanner;

public class Zadatak10 {

    /*
    10.	Napisati program koji ce nakon unosa sa tastature da ispisuje 3 puta u 3 reda IME sa razmakom.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesi ime: ");
        String ime = sc.next();

        System.out.println(ime + " " + ime + " " + ime);
        System.out.println(ime + " " + ime + " " + ime);
        System.out.println(ime + " " + ime + " " + ime);
    }
}
