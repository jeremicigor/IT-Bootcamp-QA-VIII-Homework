package domaci13;

public class Zadatak2 {

    /*
2.	Napraviti metodu koja ispisuje tekst i prihvata kao parametre dva String-a.
Ispis je u sledećem formatu: “Ime: “ text1 “i Prezime: “ text 2. text1 treba da
budu sva velika slova, dok text2 treba da budu sva mala slova. U main metodi ispisati
sa println nekoliko primera kako biste testirali (2-3 poziva je dovoljno)
     */

    public static void main(String[] args) {
        textMod("Srki" , "Djokovic");
        textMod("Agatha" , "Christie");
        textMod("Howard Phillips" , "Lovecraft");
    }

    public static void textMod (String a, String b){
        System.out.println("Ime: " + a.toUpperCase() + " Prezime: " + b.toLowerCase());
    }
}
