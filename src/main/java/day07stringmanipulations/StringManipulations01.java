package day07stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {


        //Note:Bir grup datayi ifade etmek icin "Regular Expressions" Regex kullaniriz
        //Note:Bir grup datayi degistirmek icin replaceAll()kullanilir
        /*
                        Meshur Regex
           1)Tum  rakamlar ==> [0-9]
           2)Tum kucuk harfler==> [a-z]
           3)Tum buyuk harfler==> [A-Z]
           4)Tum kucuk ve buyuk harfler==> [a-zA-Z]
           5)Tum harfler ve rakamlar ==>[a-zA-Z0-9]
           6)Tum noktalama isaretleri==>\\p{Punct}
           7)Tum sesli harfler ==> [aeiouAEIOU]
             Tum x,q,w harfleri     ==> [xqw]


           8)Kucuk harflerden farkli tum characterler ==>[^a-z]
           9)Tum harflerden farkli tum characterler ==>  [^a-zA-Z]

           10) sadece space karakteri ==>\\s
               space karakteri haric ==> \\S

               sadece rakamlar   ==> \\d
               rakamlar haric    ==> \\D
         */

        String t = "Ali 13 yasindadir!...";
        //Ornek1: "t" stringindeki tum rakamlari "*" ceviriniz
        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1);//Ali ** yasindadir!...

        //Ornek 2: "t" stringindeki tum rakamlari ve harfleri "!" e ceviriniz
        String t2 = t.replaceAll("[a-zA-Z0-9]", "!");
        System.out.println(t2);//!!! !! !!!!!!!!!!!...

        //Ornek 3: "t" stringindeki tum sesli harfleri "?" e ceviriniz
        String t3 = t.replaceAll("[aeiouAEIOU]", "?");
        System.out.println(t3);//?l? 13 y?s?nd?d?r!...

        //Ornek 4:  "t" stringindeki kucuk harfler disindaki tum characterleri "<>" ceviriniz
        String t4 = t.replaceAll("[^a-z]", "<>");
        System.out.println(t4);//<>li<><><><>yasindadir<><><><>

        //Ornek 5: "t" stringindeki tum harfler disindaki tum characterleri "+" ceviriniz
        String t5 = t.replaceAll("[^a-zA-Z]", "+");
        System.out.println(t5);//Ali++++yasindadir++++

        //Ornek 6: "t" stringindeki space ler disindaki tum characterleri "?" e ceviriniz
        String t6 = t.replaceAll("[^ ]", "?");
        System.out.println(t6);//??? ?? ??????????????

        //Ornek 7:  "t" stringindeki sesli harfler disindaki tum characterleri "&" e ceviriniz
        String t7 = t.replaceAll("[^aeiouAEIOU]", "&");
        System.out.println(t7);//A&i&&&&&a&i&&a&i&&&&&

    }
}