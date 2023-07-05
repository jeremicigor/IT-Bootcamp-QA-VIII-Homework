package domaci11;

public class Zadatak1 {

    /*
    1.	Napisati for petlju koja ide od 0 do 1000 i prikazuje sve brojeve deljive sa 3
     */

    public static void main(String[] args) {

        System.out.println("Brojevi od 0 do 1000 koji su deljivi sa 3 su: ");

        //program prikazuje i nulu kao true sto je matematicki tacno

        for (int i = 0; i<=1000; i++){
            if (i%3==0){
                System.out.println(i);
            }
        }
    }
}
