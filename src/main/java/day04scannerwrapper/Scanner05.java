package day04scannerwrapper;

import java.util.Scanner;

public class Scanner05 {

    public static void main(String[] args) {
        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("5 basamakli bir sayi giriniz");
        int number = input.nextInt();

        //Bir sayinin son rakamini alabilmek icin o sayiyi 10 a bolup kalanini aliriz.
        // % => modulus operator solunda bulunan sayinin saginda bulunan sayiya bolumunden kalani verir.
        //Dolayisiyla % 10 her zaman bize birler basamaginda bulunan sayiyi verir.
        //Bir tam sayiyi tam sayiya bolerseniz java sonucu kesinlikle tam sayi yapar.
        //Ondalik kismi iptal ederek yapar. Yuvarlama yapmaz.
        //Dolayisi ile bir tam sayiyi ona bolersek birler basamagini silmis oluruz.

        //son rakami al
        int birlerBasamagi = number%10;
        //sayi kucult
        number = number/10;

        //sondan ikinci rakami al
        int sondanIkinci = number%10;
        //sayi kucult
        number = number/10;

        //sondan ucuncu rakami al
        int sondanUcuncu = number%10;
        //sayi kucult
        number = number/10;

        //sondan dorduncu rakami al
        int sondanDorduncu = number%10;
        //sayi kucult
        number = number/10;

        //sondan besinci rakami al
        int sondanBesinci = number%10;
        //son rakam oldugu icin kucultmeye gerek yok

        System.out.println(sondanBesinci+sondanDorduncu+sondanIkinci+birlerBasamagi);


    }
}
