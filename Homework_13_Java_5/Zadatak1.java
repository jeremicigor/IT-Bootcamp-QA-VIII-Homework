package domaci13;

public class Zadatak1 {

    /*
1.	Napraviti metodu koja vraca boolean tip i prihvata kao parametre 2 integer-a.
Metoda vraća true samo ako su ta dva integer-a jedan za drugim,
na primer 16 17 ili 24 25. U main metodi ispisati sa println
nekoliko primera kako bi ste testirali (4-5 poziva je dovoljno)
     */

    public static void main(String[] args) {
        System.out.println("Zaredom? => " + brZaredom(4,5));
        System.out.println("Zaredom? => " + brZaredom(77,66));
        System.out.println("Zaredom? => " + brZaredom(255,256));
        //zbog sledeceg upita sam morao menjati metodu jer je vracao true
        //metoda je u 24. liniji bila: return (a++ == b) || (b++ == a) sto znaci da je a bio
        //povecan za 1 kad se poredio sa b++ tako da sam promenio
        System.out.println("Zaredom? => " + brZaredom(42,42));
        System.out.println("Zaredom? => " + brZaredom(-73,-72));

    }
    public static boolean brZaredom (int a, int b){
         return (a+1 == b) || (b+1 == a);
    }
}
