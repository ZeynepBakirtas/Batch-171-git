package day16arraysforeachloop;

import java.util.Arrays;

public class Array02 {
    public static void main(String[] args) {

        //Example 1: String array olusturun icine bes tane eleman ekleyin, ilk eleman ile son elemanin icerdigi
        //karakter sayilari toplamini ekrana yazdiriniz
        String arr [] = new String[5];
        arr[0] = "Math";
        arr[1] = "Science";
        arr[2] = "Music";
        arr[3] = "English";
        arr[4] = "Art";

        System.out.println(Arrays.toString(arr));//[Math, Science, Music, English, Art]
        System.out.println(arr[0].length() + arr[arr.length-1].length());//3+4=7

        //Example 2: String bir array olusturun icine bes tane eleman ekleyin, tum elemanlarin icerdigi
        //karakter sayilari toplamini ekrana yazdiriniz

        String brr[] = new String[5];
        brr[0] = "Miami";
        brr[1] = "Istanbul";
        brr[2] = "Ankara";
        brr[3] = "Oslo";
        brr[4] = "Erzurum";

        //1. Yol:
        int totalChar = 0;
        for (int i = 0; i < brr.length; i++) {
            totalChar = totalChar + brr[i].length();
        }
        System.out.println(totalChar);//30

        //2. Yol for each loop  (enhanced loop)
        //baslangic degeri, loopun calisma sarti ve increment/decrement kismini kendisi halleder.
        // for each loop "Array lerde" ve "collection larda" kullanilir.

        /*
        KALIBINI OLUSTURALIM
        for(DataType w: arr/collection){
            calisacek kodlar
        }
         */

        int sum = 0;

        for (String w: brr){
           sum += w.length();
        }

        System.out.println(sum);//30

        //Example 3: Notlar adinda Integer bir array olusturunuz icine 6 tane not yerlestiriniz ve not ortalamasini ekrana yazdiriniz
        int notlar [] = new int[6];
        notlar[0] = 50;
        notlar[1] = 70;
        notlar[2] = 60;
        notlar[3] = 40;
        notlar[4] = 90;
        notlar[5] = 80;

        int toplam = 0;
        System.out.println(Arrays.toString(notlar));
        for (int w : notlar){
            toplam += w;
        }
        System.out.println(toplam / notlar.length);

    }
}
