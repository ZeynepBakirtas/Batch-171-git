package day11nestedifternaryincrementdecrement;

public class Ternary02 {
    public static void main(String[] args) {
        //Ornek 1;
        int a = 10;
        int b = 20;

        int r1= b<a ? a++ : ++b;
        System.out.println(r1);//21
        System.out.println(a);//10
        System.out.println(b);//21

        //Ornek 2: verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
        //  -4 ==> -1*-4    4==>4

        int c = -7;
        int r2 = c < 0 ? -1 * c : c;
        System.out.println(r2);

        //Ornek 3: iki sayinin isareti ayni ise bu sayilari carpan isaretleri farkli ise
        //"farkli isaretli sayilari carpamiyorum" mesaji veren kodu yaziniz.

        int m = 5;
        int n = 6;

        Object r3 = (m>0 && n>0 || m<0 && n<0) ? m*n : "Farkli ise isaretleri carpamiyorum";
        System.out.println(r3);

        //Ornek 4: Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz

        int f = 356;
        f = Math.abs(f);

        String r4 = f>99 && f<1000 ? "Uc basamaklidir" : "Uc basamakli degildir";
        System.out.println(r4);

    }
}
