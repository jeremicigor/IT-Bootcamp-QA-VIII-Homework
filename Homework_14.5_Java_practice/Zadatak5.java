package ZadaciZaVezbanje;

public class Zadatak5 {

    /*
    5.	Napisati program koji sabira parne prirodne brojeve do 100.
     */

    public static void main(String[] args) {
        int a = 0;

        for (int i = 0; i<100; i++){
            if (i % 2 == 0){
                a += i;
            }
        }
        System.out.println("Zbir je: " + a);
    }
}
