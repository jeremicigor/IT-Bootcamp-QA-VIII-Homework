package domaci12;

public class Zadatak2 {

    /*
    2.	Kreirati niz proizvoljne duzine celobrojnih vrednosti i pomnoziti
    poslednji clan sa ukupnim brojem clanova (Koristiti .length, ne fiksnu vrednost)
     */

    public static void main(String[] args) {

        int[] niz = {11, 8, 56, 229, 909, 4, 56, 22};
        int posl = 1;
        int sum = 0;

        for(int i = 0; i<niz.length; i++){
            posl = niz[i];
            sum++;
        }
        System.out.println("Proizvod je: " + posl*sum);

    }
}
