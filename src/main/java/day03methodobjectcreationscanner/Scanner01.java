package day03methodobjectcreationscanner;

//Java nin Util kutuphanesinden scanner class import edildi.
import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        //1. adim scanner class tan object olustur.
        Scanner input = new Scanner(System.in);

        //2. adim kullaniciya ne istediginize dair mesaj veriniz.
        System.out.println("Lutfen yasinizi giriniz.");

        //3. adim Uygun adim kullanarak kullanicinin verdigi datayi memory'e yerlestiriniz.
        byte age = input.nextByte();
        System.out.println(age);
        System.out.println("age = " + age);
    }


}
