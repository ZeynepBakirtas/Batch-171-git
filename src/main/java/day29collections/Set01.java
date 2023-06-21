package day29collections;

import java.util.*;

public class Set01 {
    public static void main(String[] args) {

        /*
        1) Setler tekrarsiz eleman (unique ==> benzersiz) depolamak icin kullanilir
        2) 3 tane Set class vardir
            a) HashSet Class:
                "Hash" benzersiz bir id olusturma teknigidir. Bu teknige "Hashing Technique" denir
                "HashSet" elemanlari rastgele siralar
                "HashSet" elemanlari siralamadigindan cok hizli calisirlar
                "HashSet" ler "null" i eleman olarak kabul ederler
                "HashSet" ler tekrarsiz eleman depolamak icindir

            b) LinkedHasSet Class:
                "LinkedHasSet" elemanlari sizin verdiginiz siraya gore dizdiklerinden (insertion order) "HashSet" lere gore yavastirlar
                "LinkedHasSet" ler "null" i eleman olarak kabul ederler
                "LinkedHasSet" ler tekrarsiz eleman depolamak icindir

            c) TreeSet Class:
                "TreeSet" ler elemanlari naturel order (kucukten buyuge (ascending) yada alfabetik sira (alphabetic)) a gore dizerler
                "TreeSet" ler elemanlari naturel order'a gore dizdiklerinden cok yavastirlar
                En yavas set "TreeSet" tir

       3) TreeSet cok yavas oldugundan mumkun oldugu kadar TreeSet kullanmamaya calisilir

         */


        HashSet<String> hs = new HashSet<>();
        hs.add("Gulce");
        hs.add("Seda");
        hs.add("Omer");
        hs.add("Hasan");
        hs.add("Benna");

        System.out.println(hs);//[Hasan, Seda, Omer, Gulce, Benna]

        hs.add("Seda");//Tekrarli eleman eklediginizde hata vermez ama tekrarli elemani sadece bir kere ekler
        hs.add(null);
        hs.add(null);
        System.out.println(hs);//[null, Hasan, Seda, Omer, Gulce, Benna]

        System.out.println(hs.hashCode());//207764255

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();//LinkedHashSet classindan lhs objesi olusturduk
        lhs.add(19);
        lhs.add(13);
        lhs.add(-33);
        lhs.add(312);
        System.out.println(lhs);//[19, 13, -33, 312]

        lhs.add(null);
        System.out.println(lhs);//[19, 13, -33, 312, null]

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();//LinkedHashSet classindan lhs objesi olusturduk
        ls.add(19);
        ls.add(13);
        ls.add(313);
        ls.add(45);

        lhs.retainAll(ls);
        System.out.println(lhs);//[19, 13] ==> ilk linkedHashSet teki farkli elemanlari siler
        System.out.println(ls);//[19, 13, 313, 45]

        TreeSet<Character> ts = new TreeSet<>();
        ts.add('E');
        ts.add('G');
        ts.add('B');
        ts.add('A');
        ts.add('L');
        ts.add('Y');
        ts.add('E');
        // ts.add(null); ==> TreeSet lerde null eklenemez
        System.out.println(ts);//[A, B, E, G, L, Y]

        System.out.println(ts.first());//A
        System.out.println(ts.last());//Y

        System.out.println(ts.lower('E'));//B ==> Verilen eleman olan E den bir onceki elemani verir
        System.out.println(ts.lower('F'));//F ==> Verilen eleman olan F olmadigi icin olsaydi nerede olurduyu bulup bir oncekini verdi
        System.out.println(ts.lower('A'));// null

        System.out.println(ts.higher('B'));// E ==> Verilen eleman olan B den bir sonraki elemani verir
        System.out.println(ts.higher('F'));// G ==> verilen deger yoksa olsaydi nerede olurduya gore cevap verir

        System.out.println(ts.headSet('E'));//[A, B, E]
        System.out.println(ts.headSet('E', true));//[A, B, E]

        System.out.println(ts.tailSet('E'));//[E, G, L, Y]
        System.out.println(ts.tailSet('E', false));//[G, L, Y]

        System.out.println(ts.ceiling('G'));//G ==> Eleman set in icinde varsa elemanin kendisini verir. Ceiling = tavan
        System.out.println(ts.ceiling('F'));//G ==> Eleman set in icinde yoksa olsa ne olurduya gore sonraki elemani return eder

        System.out.println(ts.floor('B'));//B ==> Eleman set in icinde varsa elemanin kendisini verir
        System.out.println(ts.floor('C'));//B ==> Eleman set in icinde yoksa, olsa ne olurduya gore onceki elemani return eder

        System.out.println(ts.subSet('E', 'L'));//[E, G]
        System.out.println(ts.subSet('E', false, 'L', true));//[G, L]

    }
}
