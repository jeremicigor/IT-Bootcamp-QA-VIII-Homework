package domaci15;

/*
2.	Napraviti klasu film koja ima atribute ime, režiser i godina objave. U main metodu napraviti dva
različita filma i proveriti koji film je noviji.
 */

public class FilmZad2 {

    public static void main(String[] args) {

        Film film1 = new Film("Prestige", "Nolan", 2006);
        Film film2 = new Film("Trange frange", "Pera Zutic", 1994);

        if (film1.godinaObjave>film2.godinaObjave){
            System.out.println("Film " + film1.ime + " je noviji film.");
        } else if (film1.godinaObjave == film2.godinaObjave) {
            System.out.println("Filmovi " + film1.ime + " i " + film2.ime + " su izasli iste godine.");
        } else {
            System.out.println("Film " + film2.ime + " je noviji film.");
        }

    }
}
