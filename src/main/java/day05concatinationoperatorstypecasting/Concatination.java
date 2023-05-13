package day05concatinationoperatorstypecasting;

public class Concatination {
    public static void main(String[] args) {
        //Ornek 1: Bir string ve iki integer variable olusturun. String degeri ile integer larin toplamini cosola yazdirin
        String s = "elma";
        int a = 10;
        int b = 11;

        System.out.println(s + a + b);//elma1011
        System.out.println(s + (a+b));//elma 21
        System.out.println(s+a*b);//elma110
        System.out.println(a + b + s);//21elma
        System.out.println(a + s + b);//10elma11

        //java da + sembolu iki sayi arasinda kullanilirsa toplama islemi olur
        //java da + sembolu iki string arasinda yada bir string bir sayi arasinda kullanilirsa "Concation" islemi olur.
        //"Concation" birlestirme yapar.
        //NOT: Concation islemlerinde java matematikteki islem onceligi kurallarini kullanir.

        /*
        Matematikteki islem onceligi:
        1) Once uslu sayilar.
        2) Parantez ici islemler yapilir
        3) Carpma ve bolmeler yapilir
        4) Toplama ve cikarmalar yapilir.
        5) Ayni oncelikli olanlarda soldan saga baslanir.
         */


        // Ornek 2: Size string olarak verilen iki fiyatin toplamini ekrana yazdirin.
        String shirt = "2300";
        String shoes = "2500";
        System.out.println(shirt+shoes);//23002500

        //Integer.valueOf() String degerleri integer a cevirir.
        int toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println(toplamFiyat);//7500

        // Ornek 3: Size string olarak verilen iki fiyatin toplamini ekrana yazdirin.
        String tv = "$1100";
        String radio = "$300";
        System.out.println(tv+radio);//$1100$300

        int totalPrice = Integer.valueOf(tv) + Integer.valueOf(radio);
        System.out.println(totalPrice) ;

        //Note: valueOf() methodu tum karakterleri rakam olan stringleri sayilara cevirir.
        //eger valueOf() methodu kullanilirken String in icine rakam olmayan bir karakter koyarsaniz hata alirsiniz.
        //valueOf() methodu kullanilirken sadece rakam olan karakterler kullanilmalidir.






    }

}
