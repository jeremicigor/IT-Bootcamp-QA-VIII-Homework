package domaci10;

import java.util.Scanner;

public class Zadatak1 {

    /*
    1. Preko skenera uneti godinu, program treba da izracuna da li je godina prestupna.
     */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Unesi godinu: ");
        int godina = input.nextInt();

        if (godina % 4 == 0) {
            if (godina % 100 == 0) {
                if (godina % 400 == 0) {
                    System.out.println(godina + " je prestupna godina.");
                } else {
                    System.out.println(godina + " nije prestupna godina.");
                }
            } else {
                System.out.println(godina + " je prestupna godina.");
            }
        } else {
            System.out.println(godina + " nije prestupna godina.");
        }

        input.close();

    }
}
