package day08stringmanipulationmemoryusageifstatement;

import java.util.Scanner;

public class HomeworkStringManipulations {
    public static void main(String[] args) {
        //Homework

        //1) Bir string variable olusturunuz ve bu string deki rakam olmayan tum karakterlerin sayisini console a yazdiriniz
        //Once tum rakamlari hiclige cevir, sonra karakter sayisini hesapla
        String flower = "Cicekler genelde haftada 2 kez sulanmalidir.";
        int newFlower = flower.replaceAll("[0-9]","").length();
        System.out.println("newFlower = " + newFlower);

        //2) Bir string variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri console a buyuk harflerle yazdiriniz
        //son karakterin indexini ogren, replaceAll() methodu ile
        int flowerLast = flower.length()-1;
        String flowerNew = flower.substring(1,flowerLast).toUpperCase();
        System.out.println("flowerNew = " + flowerNew);

        //3) Bir string variable olusturunuz ve bu string deki ilk ve son karakterlerin ASCII degerleri toplamini console a yazdiriniz
        int ascii = flower.charAt(0) + flower.charAt(flower.length()-1);
        System.out.println("ascii = " + ascii);

        //4) Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isiminin ilk harfini buyuk harfle diger harflerini
        // kucuk harflerle console a yazdirin
        //ikiye bol ilk karakteri buyult digerlerini kucult topla
        String city = "ankArA";
        String big = city.substring(0, 1).toUpperCase() + city.substring(1).toLowerCase();
        System.out.println("big = " + big);

        /*
        5)Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
        a)En az 6 character olsun
        b)En az bir tane buyuk harf olsun
        c)En az bir tane kucuk harf olsun
        d)En az bir tane rakam olsun
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen parolanizi giriniz.");
        String password = input.nextLine();
        System.out.println("password = " + password);

        //a)En az 6 character olsun
        boolean characterNum = password.length()>6;
        System.out.println("characterNum = " + characterNum);

        //b)En az bir tane buyuk harf olsun
        boolean bigCharacter = password.replaceAll("[^A-Z]","").length()>0;
        System.out.println("bigCharacter = " + bigCharacter);
        
        //c)En az bir tane kucuk harf olsun
        boolean smallCharacter = password.replaceAll("[^a-z]","").length()>0;
        System.out.println("smallCharacter = " + smallCharacter);
        
        //d)En az bir tane rakam olsun
        boolean numCharacter = password.replaceAll("[^0-9]","").length()>0;
        System.out.println("numCharacter = " + numCharacter);

        if (characterNum&bigCharacter&smallCharacter&numCharacter){
            System.out.println("password dogru = " + password);
        }


        
        
        



























    }
}
