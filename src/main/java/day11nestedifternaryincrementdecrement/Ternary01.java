package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {

        //Ternary Statements
        //Ornek 1: Sayi 10 dan kucuk ise console a "kucuk" yazdirin, degil ise "kucuk degil" yazdirin.
        //-------if else cozumu-------

        int num = 12;

        if (num<10){
            System.out.println("Kucuk");
        } else {
            System.out.println("Kucuk degil");
        }

        //--------Ternary cozumu-----
        //          Condition   ?    Condition true ise calisir  :   Condition false ise calisir.
        String sonuc = num<10   ?         "Kucuk"                :            "Kucuk degil"     ;
        System.out.println(sonuc);


        //Ornek 2: Sayi cift ise console a "cift" tek ise "tek" yazdirin

        int k = 14;
        if (k%2==0){
            System.out.println("cift");
        }else {
            System.out.println("tek");
        }

        //------Ternary cozumu-----
        String number = k%2==0 ? "tek" : "cift";
        System.out.println(number);


        // Ornek 3: Sayi 0 dan buyukse pozitif degilse ekrana pozitif degil yazdirin
        int a = 6;
        System.out.println(a>0 ? "pozitiftir" : "pozitif degildir");


        // Ornek 4: Kullanicidan iki sayi aliniz "Buyuk olmayan"
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        //1. Yol: if else
        if (num1<num2){
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }

        //2. Yol: ternary
        double result = num1<num2 ? num1 : num2;
        System.out.println(result);

    }
}
