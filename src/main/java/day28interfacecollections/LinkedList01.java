package day28interfacecollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        //bu ilk olusturma seklimiz

        List<String> list2 = new ArrayList<>();
        // data tipini list secebildik cunku parenti Array list in
        //Array list is a List, array list is a Collection,
        // Array list is an Interable, Array list is an Object diye tanimlanabilir.

        /*
        1) ArrayListler eleman ekleme ve silme islemlerinde basarisizdirlar
            o yuzden eleman silme ve ekleme islemleri coklukla yapilacaksa Arraylist kullanmak tavsiye edilmez
        2) LinkedListler index kullanmadiklarindan node silme ve eklemede re-index yapilmasina gerek yoktur
            Bu da LinkedListleri eleman ekleme ve silmede cok basarili hale getirir(Kutuphane icin kullanilabilir)
            Bu yuzden eleman ekleme ve silmenin cok yapilmasi gereken durumlarda linkedlist kullanmak tavsiye edilir
        3) ArrayList lerde search islemi kolay yapilir cunku indexler adres gibidir(Ulkenin sekhirleri kullanilabilir. degismez)
        4) LinkedListlerde search islemi zor yapilir cunku linkedlistler index kullanmaz, index kullanmayinca herhangi bir elemani bulmak icin
            en bastan tum elemanlar kontrol edilir buda cok fazla is demektir
         */

        LinkedList<String> s = new LinkedList();
        s.add("Nuriye");
        s.add("Orhan");
        s.add("Bunyamin");
        s.add("Saadet");
        s.add("Niyazi");
        s.add("Bilal");
        s.add("Abdullah");
        s.add("Nuriye");
        s.add(2,"Omer");
        s.addFirst("Mahmut Tuncer");
        s.addLast("Emin");
        System.out.println(s);//[Mahmut Tuncer, Nuriye, Orhan, Omer, Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye, Emin]
    }
}
