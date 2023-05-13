package day05concatinationoperatorstypecasting;

public class TypeCasting {
    /*
    Numeric primitive data type larinin birbirlerine donusturulmesine "Type Casting" denir.
    Numeric (sayisal) data type lar - byte - short - int - long - float - double
     */

    //Note 1: Kucuk data typelarini buyuk data typelarina cevirmeyi java otomatik olarak yapar
    //bu isleme "AutoWidening" (otomatik genisletme) denir.

    //Note 2: Buyuk data typelarini kucuk data typelarina cevirmek riskli bir istir, java bu riskli isi otomatik olarak yapmaz
    //Bu islemi kod yazanlardan bekler.
    //Bu isleme "ExplicitNarrowing" (Aciktan Daraltma) denir

    public static void main(String[] args) {
        //byte data type ini int data type ina cevirinz
        byte age = 13;
        int ageInt = age;//AutoWidening

        //int data type ini short data type ina ceviriniz
        int weight = 312;
        short weightShort = (short)weight;//ExplicitNarrowing


        //Int data type ini float data type na ceviriniz
        int a = 10;
        float b = a;

        //double da type ini short data type ina ceviriniz
        double number = 12.99;//12.99
        short numberShort = (short) number;//12

        //Example
        short num = 260;
        System.out.println(num);

        byte numByte = (byte) num;//4
        System.out.println(numByte);
        //Not:
        //Donusum yaptigimiz sayi(260) donuseceginiz data type inin sinirlari disinda ise java kullandiginiz sayi ile mod islemi yapar ve mod isleminin
        //sonucu sizin yeni degeriniz olur






    }
}
