package ZadaciZaVezbanje;

import java.util.Scanner;

public class Zadatak8 {

    /*
    8.	Napisati program koji ce izračunati aritmetičku sredinu parnih brojeva unetih sa tastature od k do n.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi prvi broj: ");
        int k = sc.nextInt();
        int n;
        int sum = 0;
        int count = 0;

        do {
            System.out.println("Drugi broj mora biti veci od " + k + ". Unesite drugi broj: ");
            n = sc.nextInt();
        } while (k >= n);

        for (int i = k; i<=n; i++){
            if (i%2==0){
                sum += i;
                count++;
            }
        }

        double aritmetickaSredina = sum/count;
        System.out.println("Aritmeticka sredina je: " + aritmetickaSredina);

        sc.close();


    }
}
