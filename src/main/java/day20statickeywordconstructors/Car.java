package day20statickeywordconstructors;

public class Car {

    /*
    Constructor nedir?
    Class dan object uretmemize yarayan code bocklaridir.
    Class olusturdugumuzda java bize otomatik olarak bir constructor verir. Ama bu constructor gozle gorulmez
    Gozle gorulmeyen otomatik olara java tarafindan verilen bu constructorlara "default
    "default constructor"  Car() {} seklindedir.

    Bir class da farkli parametreler kullanarak istediginiz kadar constructor olusturabilirsiniz.
    Farkli constructorlar sayesinde bir class dan farkli farkli objectler olusturabilirsiniz.

    1)Constructor nasil olusturulur?
    Access modifier + Class ismi + () + {}

    Interwiev sorusu
    2) Method ile Constructor arasindaki farklar nelerdir?
        a) Methodlarda return type olur constructor larda olmaz
        b) Methodlar yaptiklari ise gore isimlendirilirler, Constructorlar ise her zaman "Class ismi" ile isimlendirilirler
        c) Methodlar bir aksiyon yapmak icin olusturulur. Constructorlar ise object olusturmak icindir.
        d) Method isimleri kucuk harfle baslar, Constructor isimleri class isimleri ile ayni oldugu icin buyuk harfle baslar.

    3) Parametreli Constructorlar olusturarak ayni class dan farkli ozelliklere sahip objectler olusturabiliriz.
     */
    String make = "Honda";//make marka
    String model = "Accord";
    int year = 2023;
    boolean hybrid = true;

    public  Car(String make,String model,int year, boolean hybrid) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.hybrid = hybrid;
    }

    public  Car(String make, String model){
        this.make = make;
        this.model = model;

    }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
