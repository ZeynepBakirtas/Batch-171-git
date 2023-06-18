package day06swapvaluesstringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {

        String s = "Learn Java earn money";
        //Ornek 1: "s" string inin money ile bitip bitmedigini kontrol ediniz.
        boolean isEnd = s.endsWith("money");
        System.out.println(isEnd);

        //Ornek 2: "s" string indeki money kelimesini dollar kelimesine ceviriniz
        String s1 = s.replace("money", "dollar");
        System.out.println(s1);

        //Ornek 3:"s" string indeki "earn" kelimesini "win" kelimesine ceviriniz
        String s2 = s.replace("earn", "win");
        System.out.println(s2);//Lwin Java win money

        //Ornek 4: "s" string indeki "a" harflerini "*" a cevirniz
        String s3 = s.replace('a', '*');
        System.out.println(s3);

        //Ornek 5: "s" string indeki "n" harflerini "xxx" a ceviriniz.
        String s4 = s.replace("n", "xxx");// tek karakter oldugunda tekli tirnak konulur.
        System.out.println(s4);

        //Ornek 6: "s" string indeki "e" harflerini siliniz
        String s5 = s.replace("e", "");
        System.out.println(s5);

        String t = "Ali 13 yasindadir!...";
        //Ornek 7: "t" stringindeki tum rakamlari yildiza ceviriniz.
        // Bir grup datayi ifade etmek icin "Regular Expressions" Regex kullaniriz.

        /*
                   Meshur Regex
        1) Tum rakamlar ==> [0-9]
        2) Tum harfler ==> [a-z]
        3) Tum buyuk 

         */







    }
}
