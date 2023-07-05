package domaci10;

import java.util.Scanner;

public class Zadatak3 {

    /*
    Napisati program gde korisnik unese dan pa mesec rodjenja i program vrati koji je to horoskopski znak.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Unesite dan rodjenja (u vidu broja): ");
        int dan = input.nextInt();

        System.out.println("Unesite mesec rodjenja (u vidu broja, Januar => 1, Februar => 2 itd.): ");
        int mesec = input.nextInt();

                if (mesec == 1) {
                    if (dan >= 1 && dan <= 19) {
                        System.out.println("Vas horoskopski znak je Jarac");
                    } else if (dan >= 20 && dan <= 31) {
                        System.out.println("Vas horoskopski znak je: Vodolija");
                    }
                } else if (mesec == 2) {
                    if (dan >= 1 && dan <= 18) {
                        System.out.println("Vas horoskopski znak je: Vodolija");
                    } else if (dan >= 19 && dan <= 29) {
                        System.out.println("Vas horoskopski znak je: Ribe");
                    }
                } else if (mesec == 3) {
                    if (dan >= 1 && dan <= 20) {
                        System.out.println("Vas horoskopski znak je: Ribe");
                    } else if (dan >= 21 && dan <= 31) {
                        System.out.println("Vas horoskopski znak je: Ovan");
                    }
                } else if (mesec == 4) {
                    if (dan >= 1 && dan <= 19) {
                        System.out.println("Vas horoskopski znak je: Ovan");
                    } else if (dan >= 20 && dan <= 30) {
                        System.out.println("Vas horoskopski znak je: Bik");
                    }
                } else if (mesec == 5) {
                    if (dan >= 1 && dan <= 20) {
                        System.out.println("Vas horoskopski znak je: Bik");
                    } else if (dan >= 21 && dan <= 31) {
                        System.out.println("Vas horoskopski znak je: Blizanci");
                    }
                } else if (mesec == 6) {
                    if (dan >= 1 && dan <= 20) {
                        System.out.println("Vas horoskopski znak je: Blizanci");
                    } else if (dan >= 21 && dan <= 30) {
                        System.out.println("Vas horoskopski znak je: Rak");
                    }
                } else if (mesec == 7) {
                    if (dan >= 1 && dan <= 22) {
                        System.out.println("Vas horoskopski znak je: Rak");
                    } else if (dan >= 23 && dan <= 31) {
                        System.out.println("Vas horoskopski znak je: Lav");
                    }
                } else if (mesec == 8) {
                    if (dan >= 1 && dan <= 22) {
                        System.out.println("Vas horoskopski znak je: Lav");
                    } else if (dan >= 23 && dan <= 31) {
                        System.out.println("Vas horoskopski znak je: Devica");
                    }
                } else if (mesec == 9) {
                    if (dan >= 1 && dan <= 22) {
                        System.out.println("Vas horoskopski znak je: Devica");
                    } else if (dan >= 23 && dan <= 30) {
                        System.out.println("Vas horoskopski znak je: Vaga");
                    }
                } else if (mesec == 10) {
                    if (dan >=1 && dan <= 22) {
                        System.out.println("Vas horoskopski znak je: Vaga");
                    } else if (dan >= 23 && dan <= 31) {
                        System.out.println("Vas horoskopski znak je: Skorpija");
                    }
                } else if (mesec == 11) {
                    if (dan >=1 && dan <= 21) {
                        System.out.println("Vas horoskopski znak je: Skorpija");
                    } else if (dan >= 22 && dan <= 30) {
                        System.out.println("Vas horoskopski znak je: Strelac");
                    }
                } else if (mesec == 12) {
                    if (dan >= 1 && dan <= 21) {
                        System.out.println("Vas horoskopski znak je: Strelac");
                    } else if (dan >= 22 && dan <= 31) {
                        System.out.println("Vas horoskopski znak je: Jarac");
                    }
                } else {
                        System.out.println("Niste pravilno uneli dan i mesec rodjenja!");
                    }

        input.close();
    }
}
