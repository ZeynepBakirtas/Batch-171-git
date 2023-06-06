package day20statickeywordconstructors;

public class StaticBlocks01 {

    //Bir variable olusturdugumuzda, deger atamazsaniz o variable i "initalize" etmeniz demektir.
    static double pi;//decleration, default: deger atamasi yapmadik
    static String shape;
    //Bazen main method calistirilmadan once variable larin hazir hale getrilmesi gerekir.
    //Bu yuzden static bloclar kullanilir.
    // static variable lar static blocklar icinde initalize edilirse o classin icinde
    // her seyden once hazir hale getirilmis olur.
    // Birden fazla static block olmasi durumunda yukarida olan once calisir...
    // Main method olmadan hicbir sey calismaz.
    //Static bloc bir class icerisinde her seyden once calistirilir.
    static {
        pi = 3.14;
        System.out.println("Static block 1");//ilk burasi calisir. Ustte oldugu icin
    }
    static {
        shape = "Circle";
        System.out.println("Static block 2");
    }
    public static void main(String[] args) {// entry point
        System.out.println(pi);
        System.out.println("main method");
    }
}
