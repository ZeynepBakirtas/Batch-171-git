package day08stringmanipulationmemoryusageifstatement;

public class IfStatements {
    public static void main(String[] args) {
        //if statements
        //Bazi kodlari bazi sartlara gore aktive edebilmek icin if statements kullanili.
        //if eger demektir ==> if cumleri

        //if you study hard, you will learn java ==> english

        /*
        if(you study hard){
            you will learn java
        }
         */

        //Ornek 1: Sayi pozitif ise ekrana pozitif yazdirin.

        int num = 13;

        if(num>0){
            System.out.println(num+"==> pozitiftir");
        }

        //Ornek 2: Sayi -1 ile 10 arasinda ise ekrana "Rakam" yazdirin
        //-1<n<10 ==> n>-1 && n<10)
        int n = 5;

        if (n>-1 && n<10){
            System.out.println("Rakam");
        }

    }
}
