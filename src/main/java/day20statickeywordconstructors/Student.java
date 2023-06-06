package day20statickeywordconstructors;

public class Student {
    /*
    1) static variable veya static methodlar (class member) tum objeler icin ortak elemandir.
    2) static class member lar uzerinde yapilan tum degisiklikler tum objectleri etkiler.
    3) static class memberlar class'a, non-static class memberlar objectlere monte edilir.
    Mesela; bir class dan 100 tane olusturdugunuzda non-static olanlar 100 kere olusturulur
    ama static olanlar object sayisindan bagimsiz olarak bir kere olusturulurlar.
    4) static class member lara ulasmak icin object olusturmaya gerek duyulmaz,
    ama non-static class memberlara ulasmak icin object olusturmak sarttir.
    5) static variable larin diger adi "class variable" dir.
    non-static variable larin diger adi "Instance variable" "Object Variable" dir.
     */

    String stdName = "Tom Hanks";//(Object variable)
    public static String stdNames = "Tom Hanks";//(static variable)
    public int age = 13;

    public static void staticMethod(){
        System.out.println("Ben static methodum...");
    }

    public void nonStaticMethod(){
        System.out.println("Ben static olmayan methodum...");
    }
}
