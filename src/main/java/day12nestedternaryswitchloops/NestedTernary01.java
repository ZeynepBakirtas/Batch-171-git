package day12nestedternaryswitchloops;

public class NestedTernary01 {
    public static void main(String[] args) {
        /*
        Ornek 1: Verilen yilin "Artik Yil(Leap Year)" olup olmadigini kontrol eden kodu yaziniz
        1) Yil 100 e bolunurse 400 e de bolunmektedir. 1600==>leap 1800==>Leap degil
        2) Yil 100 e bolunurse 4 e de bolunmektedir. 2004==>leap 2005==> leap degil
         */

        int year = 2005;
        String result = year%100==0 ? (year%400==0 ? "Leap" : "Not Leap") : (year%4==0 ? "Leap" : "Not Leap");
        System.out.println(result);










    }
}
