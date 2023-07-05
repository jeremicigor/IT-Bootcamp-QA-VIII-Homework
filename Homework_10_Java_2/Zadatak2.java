package domaci10;

import java.util.Scanner;

public class Zadatak2 {

    /*
    Napraviti promenljive "username" i "password" i definisati neke vrednosti po zelji.
    Korisnik unosi preko skenera dve vrednosti koje bi trebale da predstavljaju username i password i program
    treba da ih uporedi. Ako su username i password tačni, ispisati "Uspešno ste se ulogovali", a ako je
    jedno od ta dva pogrešno ispisati istu poruku "Pogrešan username ili password".
     */

    public static void main(String[] args) {

        String username = "LadyGaga";
        String password = "pokerface23";

        Scanner input = new Scanner(System.in);

        System.out.println("Unesite username: ");
        String usernameUnos = input.next();

        System.out.println("Unesite password: ");
        String passwordUnos = input.next();

        if (usernameUnos.equals(username) && passwordUnos.equals(password)) {
            System.out.println("Uspesno ste se ulogovali.");
        } else {
            System.out.println("Pogresan username ili password");
        }

        input.close();
    }
}

