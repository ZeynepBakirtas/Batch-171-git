package day31mapsexceptions;


public class E01 {
    /*
    Exception beklenmedik problem demektir. Java cozemedigi bir sorunla karsilastiginda exception class i devreye girer
    Exception classi bize karsilasilan sorunun cinsini, bu sorunun nereden kaynaklandigini ve sebebini verir

    Java Exception firlattiginda kodun calismasini durdurur (stops execution)
    Java Exception olusturan kod icin bizden karar vermemizi ister

    Eger hicbirsey yapmazsak beklendigi gibi java kodumuzun calismasini durdurur.
        -Kodumuzun calismaya devam etmesini istiyorsak try catch ile exception olusturmasi multemel kodlarimizi
        try catch blogu icinde yazmaliyiz

        - Exception i halledebilmek (handle) icin iki temel yol vardir
            1) Exception a uygun cozumler uretebilirsiniz.Buna Exception Handling denir
            2) Exception olustugunda bunu ilan eder ve geri cekilirsiniz. Bunada throw exception denir.

        -Exception a uygun cozumler urtemede try-catch kullanilir
        try block da yapilmasi gereken islemler javadan istenir
        Java islemi problemsiz bir sekilde yaparsa catch block java tarafindan okunmaz
        try block da islem yapilirken Exception olusursa catch block devreye girer ve catch block icindeki kodlar calisir
        try block da islem yapilirken Exception olusursa try block icndeki exception dan sonraki kodlar calistirilmaz

        catch parantez icine karsilasilmasi muhtemel olan exception class isimini ve bir obje ismi (e) catch bloguna ise
        exception ile karsilasildiginda yapilmasi istenen kodlari yazariz.

        if else kullanirsak olusabilecek her problemi specific olarak if parantezine yazmamiz gerekir, buda neredeyse imkansizdir
        ve yazacagımız kodu cok uzatir ama try catch te java ilgili exception ile alakali olusabalieceek tum problemleri yakalar
     */

    public static void main(String[] args) {

        int a = 12;
        int b = 0;
        divide(a,b);
        divide2(a,b);
    }
    //ArithmeticException yazdiginiz code da matematiksel islem kullaniyorsaniz alinabilecek bir exception dir.
    public static void divide2 (int a, int b){
        try {
            System.out.println("try block ici exception oncesi ");
            System.out.println(a / b);
            System.out.println("try block ici exception sonrasi ");

        } catch (ArithmeticException e) {
            System.out.println("Do not divide by zero ");
        }
    }

    //Kesinlikle tavsiye edilmez. if-else hata ayiklamak icin kullanilmaz.
    private static void divide(int a, int b) {
        if (b == 0) {
            System.out.println("Do not divide by zero");
        } else {
            System.out.println(a / b);
        };
    }
}
