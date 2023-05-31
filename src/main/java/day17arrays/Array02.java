package day17arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        //Example: Kullanicinin coklu data yi bir array e yerlestirebilmesi ve istedigi zamanda durdurabilmesi icin gereken kodu yaziniz
        /*
        1) Kullanicidan data almak icin Scanner Object olustur
        2) Coklu data yi yerlestirmek icin bir array olusturmaliyiz
        3) Array olusturabilmek icin kullanicidan array e kac tane eleman koyacagini almaliyiz
        4) loop olusturup eleman ekleme islemini tekrar tekrar yapabilmeliyiz
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen eklemek istediginiz ogrenci sayisini giriniz..");
        int numOfElement = input.nextInt();

        String stdNames[] = new String[numOfElement];
        System.out.println("Islemi durdurmak icin 'q' ya basiniz");

        for (int i = 0; i < stdNames.length; i++) {
            System.out.println((i+1)+ ". ogrencinin ismini giriniz");// i+1 cunku index 0 dan basliyor. Dinamik bir mesaj
            String name = input.next();

            if (name.equalsIgnoreCase("q")){
                break;
            }else{
                stdNames[i]=name;
            }
        }

        System.out.println(Arrays.toString(stdNames));
    }
}
