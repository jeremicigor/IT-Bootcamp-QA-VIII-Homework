package domaci9;

/*
Napraviti klasu Zadatak2 u okviru paketa domaci9 i uraditi konverziju celzijusa u farenhajte.
Korisnik unosi preko skenera temperaturu za celzijus u celobrojnoj vrednosti i program
ispisuje oba u formatu "31C = 87.8F", zaokruziti farenhajte na jednu decimalu.
 */

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite temperaturu u celzijusima: ");
        int celzij = sc.nextInt();

        double farenhajt = (celzij * 1.8) + 32;

        System.out.printf("%dC = %.1fF", celzij, farenhajt);


        sc.close();

    }
}
