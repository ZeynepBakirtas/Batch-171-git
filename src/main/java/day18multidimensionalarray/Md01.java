package day18multidimensionalarray;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {
        //multi dimensional array ==> cok boyutlu array
        //Bir array in elemanlari array ise bu array ler Multidimensional Array dir.

        //Multidimensional Array nasil olusturulur?

        int a[][] = new int[3][2];
        System.out.println(Arrays.deepToString(a));

        //MultiDimensiona Array lere eleman nasil eklenir? inner array lere eleman ekledik..
        a[0][0] = 5;
        a[1][1] = 45;
        a[0][1]= 12;
        a[2][0]= 123;
        a[1][0]= 81;
        a[2][1]= 0;

        System.out.println(Arrays.toString(a));//[[I@5a39699c, [I@3cb5cdba, [I@56cbfb61]
        System.out.println(Arrays.deepToString(a));//[[5, 12], [81, 45], [123, 0]]

        //Multidimensional arrayleri konsola yazdirmak icin toString() methodu degil
        //deepToString() methodunu kullanmaliyiz

        //Multidimensional array icinden spesifik bir eleman nasil yazdirilir.
        System.out.println(a[1][1]);//45
        System.out.println(a[2][0]);//123

        //Multidimensional array icindeki array nasil yazdirilir?
        System.out.println(Arrays.toString(a[0]));//[5, 12] ==> arrayleri direk yazdiramayiz, ictekide bir array(data type).

        //Kisa yoldan Multdimensional array nasil olusturulur?
        String students[][] = {{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayhan"}};

        //Ornek 1: Yukaridaki student arrayinde toplam kac tane isim oldugunu bulunuz

        int sum = 0;
        for (String[] w: students){
            sum+=w.length;
        }

        System.out.println(sum);//8
    }
}
