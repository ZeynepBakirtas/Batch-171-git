package day22arraylistsdatetime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {
    public static void main(String[] args) {
        /*
        Example 1: Kullanicinin girdigi harf list'te var ise o harfi "Buldum!" a cevirin, yok
        ise o harfi list'e ekleyin
    */
        List<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("H");
        myList.add("J");

        Scanner input = new Scanner(System.in);

        int counter = 0;
        int live = 3;
        do {
            if(counter == live){
                System.out.println("Game Over!");
                break;
            }

            System.out.println("Please enter a letter");
            String letter = input.next().substring(0,1).toUpperCase();

            if (myList.contains(letter)){//Kullanicinin girdigi harf list'te var ise
                myList.set(myList.indexOf(letter), "Buldum!");
            } else {
                myList.add(letter);
            }

            System.out.println(myList);
            counter++;
        }while (true);
    }
}
