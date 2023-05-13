package day02datatypesmethodcreation;

public class Variables02 {
    /*
    Java'da temelde iki tip data vardir
        1)primitive data type:
            char, boolean, byte, short, int, long, float, double,

        2)non-primitive data type:
            String.....
     */

        /*
        Note 1 : primitive data typelarini java olusturmustur, biz olusturamayiz
        Note 2 : primitive data typelarinin isimlerinde sadece kucuk harf kullanilir
        Note 3 : primitive datalar data type larina gore memory de farkli farkli yer kaplarlar
        Note 4 : primitive datalar iclerinde sadece sizin atadigniz degeri barindirirlar
         */

    /*
    Non-primitive Data types
    Ornegin String non primitive bir data typedir
    * Uretilen her bir class ayni zamanda bir "non-primitive" data type dir. Bu yuzden "non-primitive"
    data typelar sinirisiz sayidadir denilebilir
    *Non-primitive data typelarin isimleri buyuk harf ile baslar
    *Non-primitive ler icin java memory de buyuklugune gore degisen boyutlarda yer ayirir
     */
    public static void main(String[] args) {
        //Ornek 1: Ulke ismi icin bir variable olusturun ve bir deger atayip console a yazdirin
        String ulkeIsmi = "Turkiye";
        System.out.println(ulkeIsmi);

        /*
        Soru  primitive ve non-primitive data type lari arasindaki farklar nelerdir?
        1) "primitive" ler sadece bizim atadigimiz degeri icerir
            "non-primitive" ler bizim atadigimiz degeri ve methodlari icerir
        2) "primitive" ler kucuk harfle baslar, "non-primitive" ler buyuk harfle baslar
        3) "primitive" leri java uretmistir ve 8 tanedir
           "non-primitive" leri java ve developerlar uretebilir, sinirsiz sayidadir.
        4) "primitive" ler memory de data type larina gore sabit boyutta bellek kullanir
           "non-primitive" ler icin java memory de buyuklugune gore degisen boyutlarda bellek kullanabilirler

         */
    }
}
