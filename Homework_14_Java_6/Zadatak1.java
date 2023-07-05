package domaci14;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak1 {

    /*
    1.	Napraviti metodu koja ispisuje niz i kao parametre prihvata niz. Unutar metode pronaći najveću
    vrednost u nizu, a zatim tu vrednost postaviti kao vrednost svakog elementa u nizu. Koristiti scanner
    za popunjavanje početnog niza. (3-4 poziva dovoljno).
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi duzinu prvog niza: ");
        int duzinaNiza = sc.nextInt();
        int[] niz = new int[duzinaNiza];
        System.out.println("Unesi neki ceo broj: ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }
        izmeniNiz(niz);

        System.out.println("Unesi duzinu drugog niza: ");
        int duzinaNiza2 = sc.nextInt();
        int[] niz2 = new int[duzinaNiza2];
        System.out.println("Unesi neki ceo broj: ");
        for (int i = 0; i < niz2.length; i++) {
            niz2[i] = sc.nextInt();
        }
        izmeniNiz(niz2);

        System.out.println("Unesi duzinu treceg niza: ");
        int duzinaNiza3 = sc.nextInt();
        int[] niz3 = new int[duzinaNiza3];
        System.out.println("Unesi neki ceo broj: ");
        for (int i = 0; i < niz3.length; i++) {
            niz3[i] = sc.nextInt();
        }
        izmeniNiz(niz3);

        sc.close();

    }

    public static void izmeniNiz(int [] niz){
        int max = niz[0];
        for (int i = 1; i<niz.length; i++){
            if (niz[i]>max){
                max=niz[i];
            }
        }
        System.out.println("Prvobitni niz: ");
        for (int i = 0; i<niz.length; i++){
            System.out.print(niz[i] + " ");
        }
        System.out.println();

        Arrays.fill(niz, max);

        System.out.println("Modifikovani niz: ");
        for (int i = 0; i< niz.length; i++){
            System.out.print(niz[i] + " ");
        }
        // System.out.println(Arrays.toString(niz));
        System.out.println();

    }


}



