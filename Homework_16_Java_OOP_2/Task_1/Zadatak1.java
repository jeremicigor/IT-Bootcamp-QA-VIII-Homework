package domaci16z1;

/*
1.	Napraviti static metodu u main koje rade kao sql min, max, sum,
avg i distinct u SQLu koristeci ArrayList<Integer>. Ne morate praviti
drugu klasu sem main, a metode prihvataju ArrayList<Integer> kao parametar.
Distinct vraća novi ArrayList<Integer> dok ostale metode imaju povratne tipove
tipa int (za min, max i sum) i double (za avg)
 */

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(55);
        numbersList.add(73);
        numbersList.add(199);
        numbersList.add(14);
        numbersList.add(-201);
        numbersList.add(-4);
        numbersList.add(0);
        numbersList.add(73);
        numbersList.add(14);
        numbersList.add(-1);


        int min = minFinder(numbersList);
        int max = maxFinder(numbersList);
        int sum = sumFinder(numbersList);
        double avg = avgFinder(numbersList);
        ArrayList<Integer> distinctNumbersList = distinctFinder(numbersList);

        System.out.println("Najmanji broj u listi je: " + min);
        System.out.println("Najveci broj u listi je: " + max);
        System.out.println("Suma svih brojeva u listi je: " + sum);
        System.out.println("Srednja vrednost brojeva u listi je: " + avg);
        System.out.println("Lista s razlicitim brojevima iz liste: " + distinctNumbersList);

    }

    public static int minFinder(ArrayList<Integer> numbersList) {
        int minTemp = Integer.MAX_VALUE;
        for (int i = 0; i < numbersList.size(); i++){
            if (minTemp > numbersList.get(i)) {
                    minTemp = numbersList.get(i);
            }
        }
        return minTemp;
    }

    public static int maxFinder(ArrayList<Integer> numbersList) {
        int maxTemp = Integer.MIN_VALUE;
        for (int i = 0; i < numbersList.size(); i++){
            if (maxTemp < numbersList.get(i)) {
                maxTemp = numbersList.get(i);
            }
        }
        return maxTemp;
    }

    public static int sumFinder(ArrayList<Integer> numbersList) {
        int sumTemp = 0;
        for (int i = 0; i < numbersList.size(); i++){
            sumTemp += numbersList.get(i);
        }
        return sumTemp;
    }

    public static double avgFinder(ArrayList<Integer> numbersList) {
        int sumTemp = sumFinder(numbersList);
        return (double) sumTemp/numbersList.size();
    }

    public static ArrayList<Integer> distinctFinder(ArrayList<Integer> numbersList) {
        ArrayList<Integer> distinctNumbersListTemp = new ArrayList<>();
        for (int i = 0; i < numbersList.size(); i++){
            if (!distinctNumbersListTemp.contains(numbersList.get(i))){
                distinctNumbersListTemp.add(numbersList.get(i));
            }
        }
        return distinctNumbersListTemp;
    }

}
