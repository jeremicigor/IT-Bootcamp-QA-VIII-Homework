package ZadaciZaVezbanje;

import java.util.Scanner;

public class Zadatak7 {

    /*
    7.	Napisati program koji ce da nađe proizvod prirodnih brojeva unetih sa tastature od a do b djeljivih sa 5 i
    koliko ih ima.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi prvi broj: ");
        int a = sc.nextInt();
        int b;
        int count = 0;
        int proizvod = 1;

        do {
            System.out.println("Drugi broj mora biti veci od " + a + ". Unesite drugi broj: ");
            b = sc.nextInt();
        } while (a >= b);

        for (int i = a; i<=b; i++){
            if (i%5==0){
                proizvod = proizvod * i;
                count++;
            }

        }
        if (count==0){
            System.out.println("Nema brojeva deljivih sa 5 u ovom rangu.");
        } else {
            System.out.println("Proizvod je: " + proizvod + ". Ima ih: " + count + ".");
        }

        sc.close();
    }
}
