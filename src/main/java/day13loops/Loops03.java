package day13loops;

public class Loops03 {
    public static void main(String[] args) {

        //Ornek 1: Verilen bir String te kucuk harfleri console a yazmayiniz
        // "Pwd12?Ab" ==> P12?A
        String s = "Pwd12?Ab";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch>='a' && ch<='z'){
                continue;
            } else {
                System.out.print(ch);
            }

        }

        //Continue ifadesi, döngülerin içinde kullanılan bir kontrol ifadesidir. Döngüyü sonraki adıma atlamak için kullanılır.
        //Continue ifadesiyle karşılaşıldığında, döngünün geri kalan kısmı atlanır ve döngü bir sonraki adıma geçer.

        //note :Break ile continue arasindaki fark nedir?
        //"break" ile switch parantezinin disina cikmak icin ve loop u kirmak icin kullanilir
        //continue ise loop yaparken bazi istenen elemanlari isleme sokmamak icin kullanilir
        //continue keywordu bir loop taki gecerli iteration i sonlandirip sizi increment/decrement parta goturur


    }
}
