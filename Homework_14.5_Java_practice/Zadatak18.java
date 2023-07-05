package ZadaciZaVezbanje;

public class Zadatak18 {

    /*
    18.	Metod povrsina računa i vraća u main povrsinu pravougaonika (a*b). Main poziva metod povrsina(a,b)
    i ispisuje površine pravougaonika. Pozvati 3 puta metod sa razlicitim vrednostima.
     */

    public static void main(String[] args) {
        int duzina = 4;
        int sirina = 5;
        int area = povrsina(duzina,sirina);

        System.out.println(area);

        int d2 = 3;
        int s2 = 6;
        area = povrsina(d2,s2);

        System.out.println(area);

        int d3 = 15;
        int s3 = 20;
        area = povrsina(d3,s3);

        System.out.println(area);

    }
    public static int povrsina (int duzina, int sirina){
        return duzina*sirina;
    }
}
