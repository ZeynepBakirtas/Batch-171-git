package day26polymorphism;

public class Animal {
    /*
    1) Parent Classdaki child class icinde ozellestirerek kullanmaya overriding yapmak denir
    2) Overridiningde method signature a dokunulmaz (method signature = method ismi + parantez)
    3) private methodlar override edilmezler
    4)  Child classdaki methodun access modifieri parent classdaki override edilmis (Overriden Method)un access modifierindan
    dar olamaz. Aynisi yada daha genisi olabilir
    5) Child classda override edilen methodun return typei ile parent taki methodun return type i arasinda "IS A Relation ship"
    varsa return type degistirilebilr
    6)Methodun return type pirimitive ise Overriding yaparken return type degistirilemez. Cunku return type ya ayni olur veya
    parent tan secilir. Ama primitiveler arasinda parent child iliskisi olmadigindan aynisi olmak zorundadir
    7) Childda override edilen methodun return typei ole parent taki methodun return type i arasin IS A Relation Ship yoksa return
    type DEGISTIRILEMEZ. Mesela;
    Integer wrapper classi ile Long wrapper classi arasinda IS A Relation ship yoktur o yuzden degistirilemez
    8) Methodun return type i void ise Overriding yaparken return type degistirilemez
    9) static methodlar override edilemezler. Cunku static methodlar tum childlar icin ortak methodlardir. Bir child bir ortak methodu
    degistirdiginde diger childlar bundan olumsuz ethilenebilir. Bu yuzden java static methodlarin override edilmesine musaade etmez
    10) final methodlar override edilemezler. final methodlarin bodysi degistirilemez ama override ederken method body degistiririz
    Bu yuzden java final methodlarin override edilmesine izin vermez
        a) Final keywordunu variable lar ile kullanabiliriz
            i)Eger variable final ise mutlaka deger atanmalidir
            ii)Ilk atanan deger degistirilemz
        a) Final keywordunu method lar ile kullanabiliriz
            i)Method  final ise body degistirilemez
            ii)Degistirilemezyince override yapmak mumkun olmaz
        c) Final keywordunu class lar ile kullanabiliriz
            i) class final ise child i olamaz

    Polymorphism = Method overloading + Method Overriding
     */

    public void eat() {
        //Parenttaki override edilmis eat() methoduna Overriden Method denir
        System.out.println("Animals eat");
    }
    public void drink() {
        System.out.println("Animals drink");
    }

    public Animal create (){
        return new Animal();
    }

    public int add(int a, int b) {
        return a+b;
    }

    public Integer multiply (Integer a, Integer b){
        return a*b;
    }

    final double cicleAra(double r){
        return 3*14*r*r;
    }
}
