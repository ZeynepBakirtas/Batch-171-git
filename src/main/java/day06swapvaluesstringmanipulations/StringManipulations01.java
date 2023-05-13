package day06swapvaluesstringmanipulations;

public class StringManipulations01 {

    public static void main(String[] args) {

        //String bir non primitive data type dir. Ayni zamanda class tir.
        String s = "Java is easy";

        //Ornek 1: "s" Stringdeki tum karakterleri buyuk harf yapiniz
        String sUpper = s.toUpperCase();
        System.out.println(sUpper);//JAVA IS EASY

        //Ornek 2:  "s" Stringdeki tum karakterleri kucuk harf yapiniz
        String sLower = s.toLowerCase();
        System.out.println(sLower);//java is easy

        //Ornek 3: "s" Stringdeki ilk characteri aliniz.
        char firstChar = s.charAt(0);//
        System.out.println(firstChar);//J

        //Ornek 4: "s" stringteki bastan ikinci ve sondan ikinci characteri aliniz ve ekrana yazdiriniz.
        char secondChar = s.charAt(1);
        char secondCharLast = s.charAt(10);

        System.out.println(""+secondChar+secondCharLast);//as
        System.out.println(secondChar+secondCharLast);//212
        //"" string gordugu icin string devam ediyor. Eger koymasaydik ascii degerleriyle matematik islemi yapardi.

        //Ornek 5: "s" stringinde kullanilan karakter sayisini bulunuz.
        int sLength = s.length();
        System.out.println(sLength);//12

        //Ornek 6: "s" string indeki ilk 4 characteri aliniz.
        //s.substring(0,4) ==> bu kullanimda ilk index dahildir, ikinci index harictir.
        String sub1 = s.substring(0,4);
        System.out.println(sub1);

        //Ornek 7: "s" string indeki is kelimesini aliniz.
        String sub2 = s.substring(5,7);
        System.out.println(sub2);

        //Ornek 8: "s" string indeki "easy" kelimesini aliniz.
        String sub3 = s.substring(8,12);
        System.out.println(sub3);//easy

        //ikinci yol
        String sub4 = s.substring(8);
        System.out.println(sub4);

        //Ornek 9: "s" string inde "money" kelimesinin var olup olmadigini kontrol ediniz
        boolean isExist = s.contains("money");
        System.out.println(isExist);//false

        boolean isExist2 = s.contains("");
        System.out.println(isExist2);//true

        //Ornek 10: "s" string inin belli bir harf yada harflerle baslayip baslamadigini kontrol ediniz;
        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);

        //Ornek 11: "s" string inin 5. index dahil olmak uzere bu index ten itibaren "i"
        //karakteri ile baslayip baslamadigini kontrol eden kodu yaziniz
        boolean isBegin = s.startsWith("i", 5);
        System.out.println(isBegin);//true

    }
}
