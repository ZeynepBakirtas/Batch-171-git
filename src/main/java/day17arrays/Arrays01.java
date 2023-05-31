package day17arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //Arrayleri kisa yoldan nasil olusturabiliriz?
        int arr[] = {63, 7, 313, 8, 4};
        System.out.println(Arrays.toString(arr));//[63, 7, 313, 8, 4]

        //Example 1: Verilen array de kac tane cift sayi kac tane tek sayi oldugunu bulan kodu yaziniz

        int counter = 0;
        for (int w: arr){
            if (w%2==0){
                counter++;
            }
        }
        System.out.println("Array de " + counter + " adet cift sayi " + (arr.length - counter) + " adet tek sayi kullanilmistir.");

        //Example 2: Size verilen bir string array deki isimlerden 5 character den az character icerenleri konsola yazdiriniz.

        String stsNames[] = new String[5];
        stsNames[0] = "Ajda";
        stsNames[1] = "Ayhan";
        stsNames[2] = "Tom";
        stsNames[3] = "Cuneyt";
        stsNames[4] = "Feyza";

        for (String w: stsNames){
            if (w.length() < 5){
                System.out.println(w);
            }
        }

        //Example 3: Size verilen bir string array deki isimleri alfabetik siraya koyduktan sonra
        //"F" ile baslayan isimler haric diger isimleri console a yazdiriniz.

        //Note 1: sort() methodu sayisal data type larini kucukten buyuge dogru siralar (ascending order)
        //Note 2: sort() methodu string data type larini alfabetik olarak siralar (ascending order)
        //Note 3: ascending order  +  alphabetical order ==> Natural Order
        //Note 4: sort() methodu array elemanlarini "Natural Order" a gore siralar

        Arrays.sort(stsNames);
        System.out.println(Arrays.toString(stsNames));//[Ajda, Ali, Ayhan, Cuneyt, Tom]

        for (String w: stsNames){
            if (w.startsWith("F")){
                continue;//loop basina doner
            } else {
                System.out.println(w);
            }
        }

    }
}
