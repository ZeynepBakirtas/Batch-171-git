package day07stringmanipulations;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {


        String t = "Ali 13 yasindadir!...";
        //Ornek1: "t" stringindeki tum rakamlari "*" ceviriniz

        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println("t1 = " + t1);

        //Ornek 2: "t" stringindeki tum rakamlari ve harfleri "!" e ceviriniz
        String t2 = t.replaceAll("[0-9a-zA-Z]","!");
        System.out.println("t2 = " + t2);

        String s = "Java is easy";
        //Ornek 3: "s" Stringdeki ilk characteri aliniz.

        char s1 = s.charAt(0);
        System.out.println("s1 = " + s1);

        //Ornek 7: "s" string indeki is kelimesini aliniz. 5,7
        String s2 = s.substring(5,7);
        System.out.println("s2 = " + s2);

        //Ornek 8: "s" string indeki "easy" kelimesini aliniz.
        String s3 = s.substring(8);

        //Ornek 11: "s" string inin 5. index dahil olmak uzere bu index ten itibaren "i"
        //karakteri ile baslayip baslamadigini kontrol eden kodu yaziniz
        boolean s4 = s.startsWith("i", 5);
        System.out.println("s4 = " + s4);

        String m = "Learn Java earn money";
        //Ornek 4: "m" string indeki "a" harflerini "*" a cevirniz
        String m1 = m.replace('a', '*');
        System.out.println("m1 = " + m1);

        //Ornek 5: "m" string indeki "n" harflerini "xxx" a ceviriniz.
        String m2 = m.replace("n", "xxx");
        System.out.println("m2 = " + m2);

        //Ornek 6: "m" string indeki "e" harflerini siliniz
        String m3 = m.replace("e","");
        System.out.println("m3 = " + m3);






        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz...");
        String pwd = input.nextLine();

        //3) En az bir buyuk harf olsun
        // buyuk harf olmayanlari sil
        // kalan karakter sayisina bak
        boolean pwdR =pwd.replaceAll("[^A-Z]","").length()>0;
        System.out.println("pwdR = " + pwdR);

        //4) En az bir kucuk harf olsun
        // kucuk harf disindakileri sil
        // sayisina bak
        boolean pwdRe = pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println("pwdRe = " + pwdRe);

        //5) En az bir rakam olsun
        boolean pwdRep = pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println("pwdRep = " + pwdRep);






    }
}
