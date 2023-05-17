package day11nestedifternaryincrementdecrement;

public class IncrementDecrement {
    public static void main(String[] args) {
        //Increment
        int a = 5;
        a = a+2;//7
        a+=2;//9
        System.out.println(a);

        //Ornek 1: Bir tane integer variable olusturun ve onu iki sekilde 5 artirin
        int b = 32;
        b = b+5;
        b+=5;
        System.out.println(b);

        //Decrement
        int c = 8;
        c = c - 3;//5
        c-=3;//2
        System.out.println(c);

        //Increment 2
        int d = 6;
        d = d * 2;//12
        d *= 2;//24
        System.out.println(d);//24

        //Decrement 2
        int e = 24;
        e = e / 2; //12
        e /= 2; //6
        System.out.println(e);

        //"1" ile increment
        int f = 12;
        //f = f + 1;
        //f += 1;
        f++;

        //"1" ile decrement
        int h = 10;
        h--;

        //"post-increment" ve "pre(once)-increment"
        int i = 10;
        int k = i++;

        System.out.println(i);//11 ==> i satir sonunda artirildigi icin i nin degeri 11 olur.
        System.out.println(k);//10 ==> i artirilmadan k sepetine konuldugu icin k nin degeri 10 olur.


        int m = 15;
        int n = ++m;

        System.out.println(m);//16 ==> m satir sonunda artirildigi icin m nin degeri 16 olur.
        System.out.println(n);//16 ==> m artirildiktan sonra n sepetine konuldugu icin n nin degeri 16 olur.


        int p = 17;
        int r = p--;

        System.out.println(p);//16
        System.out.println(r);//17


        int s = 20;
        int t = --s;

        System.out.println(s);//19
        System.out.println(t);//19


        /*
        1) Increment artirmak demektir. Decrement azaltmak demektir.
        2) Increment toplama ve carpma ile, Decrement cikarma ve bolme ile yapilabilir.
        2) Increment
            a)i=i+5
            b)i+=5
            c)eger bir ile artirma soz konusu ise o zman i++; tavsiye edilir.
            Decrement
            a)i=i-5
            b)i-=5
            c)eger bir ile azaltma soz konusu ise o zman i--; tavsiye edilir.

         */

    }
}
