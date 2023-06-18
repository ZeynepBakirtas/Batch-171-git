package day24stringbuilder;

public class Sb02 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1);//Java is easy

        sb1.reverse();//Stringin ters cevrilmesini saglar
        System.out.println(sb1);//ysae si avaJ

        sb1.deleteCharAt(6);//verilen index deki karakteri siler
        System.out.println(sb1);//ysae s avaJ
        //4, 5, 6 silinir 7 silinmez
        sb1.delete(4,7);
        System.out.println(sb1);//ysaeavaJ

        //sb1.replace(2,5,"xxx") ==> 2 dahil, 5 haric olmak uzere 2,3,4 deki karakterlerin yerine xxx koyar
        sb1.replace(2,5,"x");
        System.out.println(sb1);//ysxxxvaJ

        sb1.insert(3,"OOO");
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("nava");
        StringBuilder sb3 = new StringBuilder("mava");

        //sonuc 0 ise alfabetik olarak ayni siradalar ayni siradalar demektir
        //sonuc -1 ise sb2, sb3 den alfabetik olarak 1 onde demektir
        //sonuc 1 ise sb2, sb3 den alfabetik olarak 1 sonda demektir

        int r1 = sb2.compareTo(sb3);
        System.out.println(r1);//1
        /*
        compare iki stringBuilder'i esit mi diye kontrol etmek icin ilk harften baslayarak tüm karakterleri karşılaştırır.
         Aynı olan karakterler için bir şey return etmezken farklı olan ilk karakter için ascii tablosuna göre kaç değer
         geride veya ileride olduğunu yazdırır. tamamen aynı ise bize 0 return eder
         */

        //StringBuilder nasil Stringe cevirilir?
        //toString() methodu sayesinde cevrilir.
        //String class da var olan ama stringBuilder classta var olmayan toUpperCase() gibi methodu gibi methodlara ihtiyac
        //duydugumuzda toString class methodlarini kullanabiliriz.
        String str = sb2.toString().toUpperCase();
        System.out.println(str);//NAVA
        System.out.println(sb2);//nava

        //String nasil StringBuilder a cevrilir?
        StringBuilder newSb1 = new StringBuilder(str);
        System.out.println(newSb1);
    }
}
