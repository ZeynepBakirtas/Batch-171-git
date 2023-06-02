package day17arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        //Example 1: Verilen array de kac tane cift sayi kac tane tek sayi oldugunu bulan kodu yaziniz

        int num[] = {0, 2, 5, 6, 7};
        int cift = 0;

        for (int w : num) {
            if (w % 2 == 0) {
                cift++;
            }
        }

        System.out.println("Cift sayilar: " + cift + " Tek sayilar: " + (num.length - cift));

        //Example 2: Size verilen bir string array deki isimlerden 5 character den az character icerenleri konsola yazdiriniz.

        String arr2[] = {"zeynep", "ali", "mustafa", "feyza", "buse"};

        for (String w : arr2) {
            if (w.length() < 5) {
                System.out.print(w + " ");
            }
        }
        System.out.println();

        //Example 3: Size verilen bir string array deki isimleri alfabetik siraya koyduktan sonra
        //"F" ile baslayan isimler haric diger isimleri console a yazdiriniz.

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));//[ali, buse, feyze, mustafa, zeynep]


        for (String w : arr2) {
            if (w.startsWith("f")) {
                continue;
            } else {
                System.out.print(w + " ");
            }
        }
        System.out.println();

        //Example: Kullanicinin coklu data yi bir array e yerlestirebilmesi ve istedigi zamanda durdurabilmesi icin gereken kodu yaziniz
        /*
        1) Kullanicidan data almak icin Scanner Object olustur
        2) Coklu data yi yerlestirmek icin bir array olusturmaliyiz
        3) Array olusturabilmek icin kullanicidan array e kac tane eleman koyacagini almaliyiz
        4) loop olusturup eleman ekleme islemini tekrar tekrar yapabilmeliyiz
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen eklemek istediginiz ogrenci sayisini giriniz...");
        int number = input.nextInt();
        String arr3[] = new String[number];

        System.out.println("Istediginiz zaman (q) harfine basarak kodu durdurabilirsiniz..");

        for (int i = 0; i < number; i++) {
            System.out.println((i + 1) + ". eleman: ");
            String name = input.next();
            if (name.equalsIgnoreCase("q")) {
                break;
            } else {
                arr3[i] = name;
            }
        }

        System.out.println(Arrays.toString(arr3));

        //Spesific bir elemanin array de olup olmadigini anlamak icin gereken kodu yaziniz

        String chr[] = {"F", "A", "B", "C", "G"};
        String aranan = "C";

        int counter = 0;
        for (String w : chr) {
            if (w.equalsIgnoreCase(aranan)) {
                counter++;
                break;
            }
        }

        if (counter > 0) {
            System.out.println(aranan + " elemani array de vardir");
        } else {
            System.out.println(aranan + " elemani array de yoktur");
        }
        //2. Yol
        Arrays.sort(chr);
        int result = Arrays.binarySearch(chr, aranan);// eleman yoksa eksi dondurur varsa arti. eleman yoksa olsaydi nerede olurdu onu yazdirir

        if (result > 0) {
            System.out.println(aranan + " elemani array de vardir");
        } else {
            System.out.println(aranan + " elemani array de yoktur");
        }

        //Ornek 1: Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String word[] = scan.nextLine().split(" ");

        System.out.println(word.length);

        //Ornek 2: Size verilen bir cumlede kac harf oldugunu gosteren kodu yaziniz
        String letter[] = scan.nextLine().replaceAll("[^a-zA-Z]", "").split("");
        System.out.println(letter.length);

        //Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz  [2, 3, 12, 0, 0, 0]

        int sayilar[] = {0, 2, 3, 0, 12, 0};
        int newSayilar[] = new int[sayilar.length];
        int idx = 0;

        for (int w: sayilar){
            if (w!=0){
                newSayilar[idx] = w;
            }
        }

        System.out.println(newSayilar);
    }
}
