package domaci12;

public class Zadatak1 {

    /*
    1.	Kreirati niz od 5 clanova i odstampati prvi clan (Tip izaberite sami)
     */

    public static void main(String[] args) {

        int[] niz = {888, 11, 4, 1993, 17, 2};

        for(int i = 0; i<niz.length; i++){
            if(i == 0){
                System.out.println("Prvi broj u nizu je: " + niz[i]);
            }

        }

    }
}
