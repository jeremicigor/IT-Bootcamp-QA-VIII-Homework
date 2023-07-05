package domaci17z1;

/*
1.	Napraviti apstraktnu klasu koja će da predstavlja životinju. životinja treba da ima ime, nadimak i
abstraktnu metodu koja predstavlja zvuk koji životinja pravi.Napraviti klase pas i mačka koje nasleđuju životinju.
Pas ima dodatni atribut boolean goodBoy i metodu koja ispisuje “I am a good boy” ili “I am a bad boy” u zavisnosti
od toga da li je promenljiva goodBoy true ili false. Mačka ima atribut za težinu i metodu koja ispisuje “I’m a chonk”
ili “I’m not a chonk” u zavisnosti da li je težina preko 5kg. U obe klase implementirati toString, gde u oba slučaja
se ispisuje ime i nadimak. U klasi mačka dodati na toString da ispisuje još da li je chonk ili nije, a u klasi pas
da li je good boy ili ne (u oba slučaja pozivanjem konkretne metode). U konkretnim klasama implementirati metodu za
zvuk koji životinja pravi, za mačku da vraća string “meow” a za psa “woof”. I poziv te metode dodati u toString.
U main metodi napraviti nekoliko mačaka i pasa. Staviti ih u listu i kroz petlju proći sve elemente, za pse
ispisati “dog: “ i dodati od psa toString a ako je mačka napisati “cat: “ i isto toString. Za ovo koristite instanceof.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Zadatak1 {
    public static void main(String[] args) {

        Pas doggo1 = new Pas("Dexter", "Dex", true);
        Pas doggo2 = new Pas("Srecko", "Srele", false);
        Pas doggo3 = new Pas("Cupko", "Cule", false);
        Pas doggo4 = new Pas("Sein J.", "Sein", true);

        Macka cat1 = new Macka("Jevrosima", "Jevra", 5);
        Macka cat2 = new Macka("Leposava", "Lepa", 6.77);
        Macka cat3 = new Macka("Zvonko", "Zvone", 5.22);
        Macka cat4 = new Macka("Anja", "Anjuska", 3.69);

        ArrayList<Zivotinja> animals = new ArrayList<>(Arrays.asList(doggo1, doggo2, doggo3, doggo4, cat1, cat2, cat3, cat4));

        for (int i = 0; i < animals.size(); i++) {
            Zivotinja animal = animals.get(i);
            if (animal instanceof Pas) {
                System.out.println("dog: " + animal);
                System.out.println("********** " + animal.nickname + ": " + animal.sound() + ", " + animal.sound() + ", " + ((Pas) animal).goodBoyTest() + " **********");
                System.out.println(" ");
            } else if (animal instanceof Macka) {
                System.out.println("cat: " + animal);
                System.out.println("********** " + animal.nickname + ": " + animal.sound() + ", " + animal.sound() + ", " +((Macka) animal).chonkTest() + " **********");
                System.out.println(" ");
            } else {
                System.out.println("Ne znam koja je ovo zivotinja.");
            }
        }

    }
}
