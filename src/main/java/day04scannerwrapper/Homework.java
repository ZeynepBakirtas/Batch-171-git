package day04scannerwrapper;

import java.util.Scanner;

public class Homework {

    //1) Kullanicidan aldiginiz 3 tane sayinin ortalamsasini bulan kodu yaziniz.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("3 tane sayi giriniz");
        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();
        double thirdNumber = input.nextDouble();

        double average = (firstNumber+secondNumber+thirdNumber) / 3;
        System.out.println("average = " + average);

        //2) Kullanicidan aldiginiz 3 basamakli bir sayinin rakamlari toplamini bulunuz.
        System.out.println("3 basamakli bir sayi giriniz");
        int number = input.nextInt();

        int firstNum = number % 10;
        //sayi kucult
        number = number / 10;

        int secondNum = number % 10;
        //sayi kucult
        number = number / 10;

        int thirdNum = number % 10;

        //uc rakamin toplami
        System.out.println(firstNum+secondNum+thirdNum);


    }
}
