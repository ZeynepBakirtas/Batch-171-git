package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {

        //Ornek: Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        //a) Alanini hesaplayiniz
        //b) Cevrsini hesaplayiniz

        Scanner input = new Scanner(System.in);

        System.out.println("Dikdortgenin kisa kenar uzunlugunu giriniz");
        double shortSide = input.nextDouble();
        System.out.println("Dikdortgenin uzun kenar uzunlugunu giriniz");
        double longSide = input.nextDouble();

        System.out.println("Alan = " + (shortSide * longSide));

        System.out.println("Cevre = " + ((shortSide + longSide) * 2));






    }
}
