package day04scannerwrapper;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        //Ornek: kullanicidan ilk ismini ve soy ismini alip ikisini ayni satirda ekrana yazdiriniz

        //1. adim Scanner class tan bir obje olustur
        Scanner input = new Scanner(System.in);

        //2. adim: Kullaniciya ne istedigimize dair mesaj veriniz
        System.out.println("Ilk isminizi giriniz");

        //next() metodu kullanicidan tek kelimeli string almak icin kullanilir.
        //3. adim: Uygun methodu kullanarak kullanicinin verdigi datayi memory e yerlestiriniz
        String firstName = input.next();

        System.out.println("Soy ismini giriniz..");
        String lastName = input.next();

        System.out.println(firstName+" "+lastName);//Ali Can




    }
}
