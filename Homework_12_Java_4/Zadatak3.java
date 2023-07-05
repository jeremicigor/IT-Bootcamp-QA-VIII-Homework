package domaci12;

public class Zadatak3 {

    /*
    3.	Kreirati dva niza i prikazati koji niz ima vise clanova (Ne morate petlju koristiti vec mozete if statement)
     */

    public static void main(String[] args) {

        int[] niz1 = {1, 2, 3, 5, 8, 13, 21, 34, 55};
        int[] niz2 = {2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};

        if (niz1.length>niz2.length) {
            System.out.println("Prvi niz ima vise clanova.");
        } else if (niz1.length<niz2.length){
            System.out.println("Drugi niz ima vise clanova.");
        } else
            System.out.println("Nizovi imaju isti broj clanova.");

    }
}
