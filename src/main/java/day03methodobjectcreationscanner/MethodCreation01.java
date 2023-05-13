package day03methodobjectcreationscanner;

public class MethodCreation01 {


    public static void main(String[] args) {
        double kup = getCube(5);
        System.out.println("kup = " + kup);

        print("Java is easy");

        //method olusturmak icin ikinci yol
        //Ornek 2 ikinci yol: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz.
        //Main method icinde iken method ta kullanilacak olan variable lari olusturunuz.
        String str = "TechproEdu";
        //method ismi ve parametreleri yazariz
        //kirmizi kismin uzerinde bekleyip create method a tiklariz intellij otomatik olarak bir method olusturur.
        //sonra kendi istegimize gore dizayn ederiz.
        printConsole(str);

        //Ornek 3 : verilen iki tam sayiyi carpan ve sonucu ekrana yazdiran
        int a = 3;
        int b = 5;
        carpmaYap(a, b);


        //Ornek 4: verilen bir tamsayinin karesini hesaplayip console a yazdiran methodu olusturup kullaniniz
        int sayi = 5;
        karesiniAl(sayi);



    }

    private static void karesiniAl(int sayi) {
        System.out.println(sayi*sayi);
    }

    private static void carpmaYap(int a, int b) {
        System.out.println(a*b);
    }

    private static void printConsole(String str) {
        System.out.println(str);
    }

    //Ornek1 : verilen bir ondalik sayinin kupunu hesaplayan bir method olusturup kullaniniz.
    static double getCube(double a){
        return a*a*a;
    }
    //Note: access modifier i default yapmak isterseniz access modifier yazmayiniz.
    //Method ismi ve parametreler signature.

    //Ornek 2: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz?
    public static void print(String str){
        System.out.println(str);
    }

    //Eger bir method yeni bir data uretmiyor ise return type i void olur.
    //Methodun return type i void ise method kodu icinde return keywordu yazilmaz.







}
