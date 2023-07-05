package ZadaciZaVezbanje;

import java.util.Scanner;

public class Zadatak3 {

    /*
    3.	Napisati program za ispis uspeha za uneti broj sa tastature, prema sledećoj tabeli:
      *nedostaje tebela*
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi ocenu: ");
        int ocena = sc.nextInt();

        switch (ocena){
            case 1:
                System.out.println("Nedovoljan");
                break;
            case 2:
                System.out.println("Dovoljan");
                break;
            case 3:
                System.out.println("Dobar");
                break;
            case 4:
                System.out.println("Vrlo dobar");
                break;
            case 5:
                System.out.println("Odlican");
                break;
            default:
                System.out.println("Pogrean unos ocene");
        }
        sc.close();

    }
}
