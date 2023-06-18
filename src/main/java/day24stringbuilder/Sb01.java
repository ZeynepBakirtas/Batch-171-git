package day24stringbuilder;

public class Sb01 {
    public static void main(String[] args) {
        /*
        1) "StringBuilder" classi da string ureten bir classtir.
        2) "String" Class kullanara string uretiriz, nicin "StringBuilder" classi da var?
            String Class immutable(degistirilemez) String uretiriz,
            "StringBuilder" class mutabler(degistirilebilir)
        3) "immutable" olmak demek orjinal degerin korunmasi, degistirilemez olmasi demektir. String classinin bir ozelligi
            "mutable" olmak demek orjinal degerin degistirilebilir olmasi demektir.
         */

        //Immutable
        String s = "Java";
        String t = s + "!";
        String w = t + "?";

        //String i degistirdikten sonra ayni string assign ederseniz, java yine yeni bir container olusturur.
        //degismis degeri bu yeni container in icine koyar ve eski container i gosteren pointer yeni container a yonlendirir
        //Dolayisiyla eski container adressiz kalir, ve "Garbage Collector" adressiz olan container'lari siler

        String a = "Money";
        a = a+ "more";

        //Mutable
        //StringBuilder kullanarak string olusturmanin 1. yolu
        StringBuilder sb1 = new StringBuilder("Python");
        System.out.println(sb1);//Python
        sb1.append("!");
        System.out.println(sb1);//Python!

        //StirngBuilder kullanarak string olusturmanin 2. yolu
        StringBuilder sb2 = new StringBuilder();
        System.out.println("sb2.length() = " + sb2.length());//0
        System.out.println("sb2.capacity() = " + sb2.capacity());//16

        sb2.append("Java");
        sb2.append("xxxxxxxxxxxxxxxxxxx");

        //capacity() ve length() arasindaki fark nedir?
        System.out.println("sb2.length() = " + sb2.length());//4
        System.out.println("sb2.capacity() = " + sb2.capacity());//16

        //capacity() javanin size verdigi data depolama yer sayisidir
        //length ise size verilen data depolama yerinin kullanilan kismidir
        //Java baslangic olarak size verilen capacity' i 16 olarak verir, eger siz verilen capacity asarsaniz
        // java yeni capacity'i varolanin 2 katinin 2 fazlasi olacak sekilde degistirir
        //16 ==> 16*2 + 2          34 ==> 34*2+2

        //StringBuilder kullanarak string olusturmanin 3. yolu
        //default capacity i nasil degistirebiliriz?
        StringBuilder sb3 = new StringBuilder(3);
        sb3.append("ali");
    }
}
