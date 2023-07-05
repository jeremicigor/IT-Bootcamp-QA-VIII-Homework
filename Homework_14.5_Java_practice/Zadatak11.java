package ZadaciZaVezbanje;

import java.util.Scanner;

public class Zadatak11 {

    /*
    11.	Napisati program koji ce nakon unosa sa tastature ispisati pravougaoni trougao kao na slici sa proizvoljnim brojem redova:

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi broj redova: ");
        int brojRedova = sc.nextInt();

        for (int i = 0; i<brojRedova; i++){
            for (int j = 0; j<=i; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}
