package day24stringbuilder;

public class Student {
    /*
    Access Modifier
    1)public
    2)protected
    3)default(Access modifier i default yapmak icin basina access modifier yazmayiniz)
    4)private

    Note: Access Modifier lari genisten dara dogru siralayiniz
    public > protected > default > private

    public ==> Her class dan kullanilabilir
    protected==> protected olanlar baska package lardan kullanilamaz
                ancak baska package da child class icinden kullanilabilir
    default ==> default olanlar baska package lardan kullanilamaz
    private ==> olanlar sadece olusturulduklari class icinde kullanilabilirler

    Note: "protected" ile "default" un farkini soyleyiniz
            protected olanlar baska package lardan kullanilamaz
            ancak baska package da child class icinden kullanilabilir
            default olanlar baska package lardan kullanilamaz
     */

    //public her class dan kullanilabilir
    public String stdName="Ali Can";

    //protected olanlar kendi package ve baska package larin child classlardan gorulur
    protected String address="Istanbul";

    //default olanlar baska package tan kullanilamazlar
    String email="alican@gmail.com";

    //private olanlar sadece olusturulduklari class icinde kullanilabilirler
    private String ssnId ="65416543541";
}
