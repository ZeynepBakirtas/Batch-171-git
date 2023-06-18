package day25inheritance;

public class Animal {
    //Inheritance ==> miras alma
    /*
    Ozellikleri (aktif ve pasif) bir classtan diger classlara alan bir kavramdir
    Mesela siz bir class olusturmak istiyorsunuz ama daha once olusturulmus bir class
    sizin istediginiz ozelliklerin cogunu kapsiyor. O zaman yeni olusturdugunuz class i ozelliklerini kullanmak
    istediginiz class a child yaparsiniz

    Inheritance'in faydalari
    1) Code tekrarlarindan kurtuluruz
    2) Code tamiri(maintenance) kolay olur
    3) Child classlari daha atomic yapmis oluruz

    ==>Bir classi baska bir classin child classi yapmak icin extends keywordu kullanilir.
    Ilk yazilan child, ikinci yazilan parant olur, parent class'a super class da denir

    ==> child class objectleri parent class tan method ve variable lari kullanabilirler
    ==> parent class objectleri child classtan method ve variablelari kullanamazlar

    ==> Javada bir classin sadece 1 tane parenti olabilir, coklu parent'a "Multiple Inheritance" derler,
    tekli parent'a "single inheritance" derler. Java "Multiple Inheritance" i desteklemez, Java single inheritance kullanir

    => Apartman seklindeki inheritance yapisina "MultiLevel Inheritance" denir. Java multiLevel inheritance i destekler

    => Object class her classin parentidir. Java da object class haric her classin parenti vardir
        Java da parent i olmayan tek class object classdir

    => Java da parent'dan child'a olan iliskilere "HAS-A Relation Ship" denir.
       child'dan parent'a olan iliskilere "IS-A Relation Ship" denir

    ==> Javada her classin bir tane default constructoru vardir. Bu default constructor classin icinde gorunmez
        cunku default constructor "Object Class" icindedir. yani parent class
     */
    public void  eat() {
        System.out.println("Animals eat...");
    }
    public void  drink() {
        System.out.println("Animals drink...");
    }
}
