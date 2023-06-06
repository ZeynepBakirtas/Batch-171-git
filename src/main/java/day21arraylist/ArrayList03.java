package day21arraylist;

import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {
        //Kisa yoldan bir list nasil olusturulur?
        List<Character> initials = List.of('a','c','a','k');
        System.out.println(initials);//[a, c, d, k]
        // initials.add('b');
        // initials.set(0,'u');
        // initials.remove(initials.indexOf('a'));

        //List.of() methodu degistirilemez bir list olusturmak icin kullanilir,
        // bu nedenle list uzerinde degisiklik yapmaya yonelik methodlari desteklemez ama diger list methodlarani kullanabiliriz

        //indexOf(aranan karakter) methodu aranan karakterin ilk gorununumun indexini verir.
        int r1= initials.indexOf('a');
        System.out.println(r1);//0

        //lastIndexOf(aranan karakter) methodu aranan karakterin son gorununumun indexini verir.
        int r2= initials.lastIndexOf('a');
        System.out.println(r2);//2

    }
}
