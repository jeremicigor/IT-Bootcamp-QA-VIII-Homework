package ZadaciZaVezbanje;

import java.util.Scanner;

public class Zadatak13 {

    /*
    13.	Napisati program za ispis kvadrata prirodnih brojeva do n unetih sa tastature (while petlja).
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesi broj: ");
        int n = sc.nextInt();
        int count = 1;

        while (count<=n){
            System.out.println(Math.pow(count,2));
            count++;
        }

    }
}
