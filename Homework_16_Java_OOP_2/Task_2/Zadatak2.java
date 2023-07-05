package domaci16z2;

/*
2.	Napraviti klasu Konverter koja kao atribute ima rsd i valutu. Valuta je enum, dok je rsd celi broj.
Valuta treba da bude jedna od: EUR, USD, AUD, CAD, RUB i GBP.
Kroz konstruktor se unose vrednosti za dinare (rsd) i valutu, i postoje seteri, ali ne postoje geteri.
Napraviti metodu koja služi za konvertovanje valute u onu koja je prosleđena kroz konstruktor ili seter.
Znači rsd pretvara u tu neku valutu. U metodi koristiti iif else ili switch za poređenje. Pogledati kako se
porede enum-i u javi najpravilnije. U main-u testirati tako što će te napraviti jedan objekat tipa Konverter i
isprobati za sve valute.
 */


public class Zadatak2 {
    public static void main(String[] args) {

        // za testiranje negativnog unosa ili 0:
        // Konverter trade1 = new Konverter(Valuta.USD, -23);

        // Pozitivan unos:
        Konverter trade1 = new Konverter(Valuta.USD, 1000);
//        Konverter trade2 = new Konverter(Valuta.EUR, 1000);
//        Konverter trade3 = new Konverter(Valuta.AUD, 1000);
//        Konverter trade4 = new Konverter(Valuta.CAD, 1000);
//        Konverter trade5 = new Konverter(Valuta.RUB, 1000);
//        Konverter trade6 = new Konverter(Valuta.GBP, 1000);
//        Konverter trade7 = new Konverter(Valuta.EUR, 2500000);
//        Konverter trade8 = new Konverter(Valuta.EUR, 94000);

        trade1.convert();

        trade1.setValuta(Valuta.RUB);
        trade1.convert();

        trade1.setValuta(Valuta.EUR);
        trade1.convert();

        trade1.setValuta(Valuta.GBP);
        trade1.convert();

        trade1.setValuta(Valuta.CAD);
        trade1.convert();

        trade1.setValuta(Valuta.AUD);
        trade1.convert();


    }
}
