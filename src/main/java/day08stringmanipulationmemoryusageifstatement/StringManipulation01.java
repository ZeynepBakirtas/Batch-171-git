package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation01 {
    public static void main(String[] args) {
        //Ornek 1: Bir stringin hic character icemedigini (bos string oldugunu) kontrol eden kodu yaziniz.
        //1. yol length() methodu kullanilarak cozuldu
        String str = "";
        boolean result1 = str.length()==0;
        System.out.println("String bos mu? " + result1);

        //2. yol tavsiye edilir.
        //Java eger bir method olusturmussa, o methodu kullanmak en iyisidir.
        boolean result2 = str.isEmpty();
        System.out.println("Is empty ? " + result2);

        //Ornek 2: Bir stringin space haric hicbir karakter icermedigini kontrol eden kodu yaziniz.
        String t = "    ";
        //1. yol
        boolean result3 = t.replace(" ","").length()==0;
        System.out.println(result3);

        //2. yol
        boolean result4 = t.replace(" ","").isEmpty();
        System.out.println("result4 = " + result4);

        //3. Yol
        boolean result5 = t.isBlank();
        System.out.println("result5 = " + result5);
        //isBlank() methodu sadece space iceren String ler icin true verir, space disinda bir karakter var ise false verir.
        //isBlank() methodu bos stringler icin de true verir.
        //isBlank() methodu space + hicbir sey icin true verir.
        //isEmpty() methodu sadece hicbir sey icin true verir.
        //isBlank() kelimesel anlamda bos mu diye bakiyor. isEmpty sayisal anlamda bos mu diye bakiyor.


        //Ornek 3: String de a, i, e karakterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdirinz.
        // "Java is easy to learn" ==> 1 + 5 + 8 ==> 14
        // 0123456789.....
        String r = "Java is easy to learn";
        int idxA = r.indexOf('a');
        System.out.println(idxA);//1

        int idxI = r.indexOf('i');
        System.out.println(idxI);//5

        int idxE = r.indexOf('e');
        System.out.println(idxE);//8

        System.out.println(idxA+idxI+idxE);//14

        //Ornek 4: Bir stringdeki "Java" kelimesinin ilk olarak kacinci index te kullanildigini gosteren kodu yaziniz.
        // "Ah Java vah Java sensiz olmuyor Java."
        // indexOf("Java") kullaniminda siz "Java" kelimesinin ilk gorunumundeki ilk harfin (yani J nin index ini almis oluruz.

        String u = "Ah Java vah Java sensiz olmuyor Java.";
        int idxJava = u.indexOf("Java");
        System.out.println(idxJava);//3

        // indexOf() methodu olmayan karakterler icin kullanilirsa her zaman -1 return eder.
        int idxjava = u.indexOf("java");
        System.out.println(idxjava);//-1

        //Ornek 5: Bir String de a, i, e karakterlerinin son gorunumlerinin indexleri toplamini ekrana yazdirinz.
        String v = "Java is easy to learn";
        int idxOfa = v.lastIndexOf('a');
        System.out.println(idxOfa);

        int idxOfi = v.lastIndexOf('i');
        System.out.println(idxOfi);

        int idxOfe = v.lastIndexOf('e');
        System.out.println(idxOfe);

        System.out.println(idxOfe+idxOfa+idxOfi);

        //Note: lastIndexOf methodu olmayan karakterler icin kullanilirsa her zaman -1 return eder.
    }

}
