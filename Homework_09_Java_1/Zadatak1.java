package domaci9;

import java.util.Scanner;

/* Napraviti paket domaci9 i klasu Zadatak1 i u njoj napraviti main metodu (public static void main...)
preko skenera uneti svoje ime i prezime (odvojeno) i godinu rodjenja, ispisati ime i prezime i koliko godina imate.
 */
public class Zadatak1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Unesite ime: ");
        String ime = input.next();

        System.out.println("Unesite prezime: ");
        String prezime = input.next();

        System.out.println("Unesite godinu rodjenja: ");
        int godinaRodjena = input.nextInt();

        int godine = 2023 - godinaRodjena;

        System.out.println("Vi ste " + ime + " " + prezime + " i imate " + godine + " godina/e." );

        input.close();

    }
}
