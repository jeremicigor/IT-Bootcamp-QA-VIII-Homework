package domaci15;

/*
  1.	Napisati klasu radnik koja ima atribute ime, prezime i godinu zaposlenja.
  Napraviti metodu koja proverava da li je zaposlen u firmi duze od 10 godina (parametar metode).
  U main metodi napraviti 3 radnika i za svakog ispisati da li radnik radi više od 10 godina u firmi,
   */

public class RadnikZad1 {

    public static void main(String[] args) {

        String pozitivno = " radi vise od 10 godina u firmi.";
        String negativno = " radi manje od 10 godina u firmi.";
        String razmak = " ";

        Radnik radnik1 = new Radnik();

        radnik1.ime = "Zvonko";
        radnik1.prezime = "Rankovic";
        radnik1.godinaZaposlenja = 1999;

        Radnik radnik2 = new Radnik("Nenad", "Milosevic", 2015);
        Radnik radnik3 = new Radnik("Klarens", "Sejdorf", 1974);

        // System.out.println(radnik2.duzinaZaposlenja());

        if (radnik1.duzinaZaposlenja()){
            System.out.println(radnik1.ime + razmak + radnik1.prezime + pozitivno);
        } else {
            System.out.println(radnik1.ime + razmak + radnik1.prezime + negativno);
        }

        if (radnik2.duzinaZaposlenja()){
            System.out.println(radnik2.ime + razmak + radnik2.prezime + pozitivno);
        } else {
            System.out.println(radnik2.ime + razmak + radnik2.prezime + negativno);
        }

        if (radnik3.duzinaZaposlenja()){
            System.out.println(radnik3.ime + razmak + radnik3.prezime + pozitivno);
        } else {
            System.out.println(radnik3.ime + razmak + radnik3.prezime + negativno);
        }
    }
}
