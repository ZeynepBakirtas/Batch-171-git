package day14loops;

public class Loops01 {
    public static void main(String[] args) {
        //Ornek 1: Bir stringi ters ceviren kodu yaziniz
        //"Java" ==> "avaJ"

        //1. Yol

        String m = "Java";
        String ters = "";

        for (int i = m.length()-1; i >= 0; i--) {
            ters += m.substring(i, i+1);
        }

        System.out.println(ters);

        //2.Yol
        String t = "Java";
        String ters2 = "";

        for (int i = t.length()-1; i >= 0; i--) {
            ters2 += t.charAt(i);
        }
        System.out.println(ters2);


        //Ornek 2: Size verilen bir stringin palindrome olup olmadigini kontrol eden kodu yaziniz.
        // ey edip adanada pide ya, nalan, kucuk, ada
        // Logic : Stringi ters cevir sonrada duz hali ile ters halini karsilastir, ayni ise Palinddrome dur.

        String duz = "Ey edip adanada pide ye";
        String ters3 = "";

        for (int i = duz.length()-1; i>=0 ; i--) {
            ters3 += duz.charAt(i);
        }
        System.out.println("ters3 = " + ters3);

        System.out.println(duz.equalsIgnoreCase(ters3) ? "Palindrome dur" : "Palindrome degildir");













    }
}
