package day16arraysforeachloop;

import java.util.Arrays;

public class Testing {
    public static void main(String[] args) {
        //Ornek 1: Arraydeki her elemanin sonuna "!" isareti koyarak ekrana yazdiriniz.
        String stdNames[] = new String[5];
        stdNames[2] = "Benna";
        stdNames[3] = "Abdullah";
        stdNames[4] = "Recep";
        stdNames[0] = "Ekim";
        stdNames[1] = "Zeynep";

        for (String w:stdNames){
            System.out.println(w + "!");
        }
        //Example 1: String array olusturun icine bes tane eleman ekleyin, ilk eleman ile son elemanin icerdigi
        //karakter sayilari toplamini ekrana yazdiriniz

        int karakterSayisi = stdNames[0].length() + stdNames[stdNames.length-1].length();
        System.out.println("karakterSayisi = " + karakterSayisi);//4+5=9

        //Example 2: String bir array olusturun icine bes tane eleman ekleyin, tum elemanlarin icerdigi
        //karakter sayilari toplamini ekrana yazdiriniz
        double counter = 0;
        for (String w: stdNames){
            counter+=w.length();
        }

        System.out.println("counter = " + counter);

        //Example 3: Notlar adinda Integer bir array olusturunuz icine 6 tane not yerlestiriniz ve not ortalamasini ekrana yazdiriniz

        Integer notlar[] = new Integer[6];
        notlar[0] = 3;
        notlar[1] = 2;
        notlar[2] = 1;
        notlar[3] = 4;
        notlar[4] = 7;
        notlar[5] = 8;

        Arrays.sort(notlar);// kucukten buyuge dizer
        System.out.println(Arrays.toString(notlar));

        double topla = 0;
        for (int w:notlar){
            topla += w;
        }
        System.out.println("Ortalama: " + topla/6);

        int min = notlar[0];
        int max = notlar[0];

        for (int w:notlar){
            min = Math.min(min,w);
            max = Math.max(max, w);
        }

        System.out.println(max+min);
        System.out.println(notlar[0]+notlar[notlar.length-1]);

    }
}
