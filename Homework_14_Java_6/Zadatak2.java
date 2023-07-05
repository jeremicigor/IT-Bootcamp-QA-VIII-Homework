package domaci14;

import java.util.Scanner;

public class Zadatak2 {

    /*
    2.	Napraviti metodu koja radi konverziju valuta. Valute koje se koriste su EUR, USD, GBP.
    Napisati konverzije preko switch-a, tako sto proveravate koju je valutu korisnik uneo kao parametar,
    a vracate (return) u toj nekoj novoj valuti izracunatu vrednost. U main-u preko skenera korisnik unosi
    broj dinara koji zeli da konvertuje u neku valutu, i samu valutu kao string. Ispisati nekoliko primera
    poziva u main-u. Valute su vrednosti double i njih mozete uzeti sa sajta NBS. (3-4 poziva dovoljno).
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double iznos;
        do {
            System.out.print("Unesi iznos u RSD: ");
            iznos = sc.nextDouble(); }
        while (iznos <=0);

        System.out.print("Unesite zeljenu valutu (EUR/USD/GBP): ");
        String valuta = sc.next();

        double iznosF = konvertor(iznos, valuta);
        if (iznosF != -1) {
            System.out.println(iznos + " RSD je : " + iznosF + " " + valuta.toUpperCase());
        }

        System.out.println();

        double iznosPrimer = 1000;
        String valuta1 = "EUR";
        String valuta2 = "USD";
        String valuta3 = "GBP";
        System.out.println(iznosPrimer + " RSD je : " + konvertor(iznosPrimer, valuta1) + " EUR.");
        System.out.println(iznosPrimer + " RSD je : " + konvertor(iznosPrimer, valuta2) + " USD.");
        System.out.println(iznosPrimer + " RSD je : " + konvertor(iznosPrimer, valuta3) + " GBP.");

        sc.close();
    }
// eur 117.2954, usd 106.1977, gbp 133,8683
    public static double konvertor (double iznos, String valuta){
        String valutaF = valuta.toUpperCase();
        switch (valutaF) {
            case "EUR":
                double iznosEUR = iznos/117.2954;
                return iznosEUR;

            case "GBP":
                double iznosGPB = iznos/133.8683;
                return iznosGPB;

            case "USD":
                double iznosUSD = iznos/106.1977;
                return iznosUSD;

            default:
                System.out.println("Pogresan unos valute. Pokusajte ponovo.");
                return -1;
        }


    }

}
