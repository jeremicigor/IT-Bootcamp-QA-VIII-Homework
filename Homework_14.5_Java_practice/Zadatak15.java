package ZadaciZaVezbanje;

public class Zadatak15 {

    /*
15.	Napisati program koji ce učitati elemente niza i ispisati elemente niza sa neparnim indeksom.
     */


    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,44,54,22,352,23423,5,1,1,0,6,54,36346,878,234};

        for (int i = 0; i<arr.length; i++){
            if (i%2==1){
                System.out.print(arr[i] + " ");
            }
        }

    }
}
