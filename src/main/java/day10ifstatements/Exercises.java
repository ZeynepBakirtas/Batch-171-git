package day10ifstatements;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {


        /*
         Example 1: Kullanicidan 3 tane sayi aliniz.
          Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
          Eger ucgen ise “eskenar” Ucgen olma durumunu kontrol ediniz.
          INFO :
          Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
                            herhangi iki kenar farki ucuncu kenardan kucuk olmali
                 a+b>c>|a-b| ==> a+b>c && c>a-b
                 a+c>b>|a-c|
                 b+c>a>|b-c|
                 a=b=c ise eskenar ucgen
        */

         /*
          Example 2:Kullanicidan bir ucgenin kenar uzunluklarini aliniz
                    Uc kenari birbirine esit ise "Eskenar Ucgen " yazdiriniz
                    Sadece iki kenar uzunlugu biribirine esit ise "Ikizkenar ucgen"
                    Tum kenarlari birbirinden farkli ise "Cesitkenar Ucgen" yazdiriniz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please entry 3 number!");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        boolean isTriangle = a+b>c && c>Math.abs(a-b) &&
                a+c>b && b>Math.abs(a-c) &&
                b+c>a && a>Math.abs(b-c);

        if (isTriangle){
            if (a==b && a==c){
                System.out.println("Eskenar ucgnedir.");
            } else if (a==c || a==b || b==c){
                System.out.println("Ikizkenar ucgendir");
            }else {
                System.out.println("Cesitkenar ucgendir");
            }
        } else {
            System.out.println("Ucgen degildir");
        }

    }
}
