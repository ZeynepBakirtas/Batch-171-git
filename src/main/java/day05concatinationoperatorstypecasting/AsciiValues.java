package day05concatinationoperatorstypecasting;

public class AsciiValues {
    public static void main(String[] args) {
        /*
        Java da her karakterin sayisal bir degeri vardir.
        Bu degerler ascii degerler olarak adlandirilir.
        Bu degerlerin tamaminin bulundugu tabloya ASCII Table denir.
         */

        //Herhangi bir karakterin ASCII degerini bulmak icin o karakteri "int" data type inda bir variable icine koyariz.
        char a = 'a';
        System.out.println(a);//a

        int intA = 'a';
        System.out.println(intA); //97

        byte unlem = '!';
        System.out.println(unlem);//33

        char c1 = 'K';
        char c2 =  '?';
        System.out.println(c1+c2);//138
        //java da char lari matematiksel islemlerde kullanirsaniz, java char larin ASCII degerlerini kullanir.


    }
}
