package day09ifstatements;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {

        //Ornek 1: Kullanicidan aldiginiz bir sayinin tek mi cift mi oldugunu konsola yazdiriniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");
        int num = input.nextInt();

        //1. Yol
        //Kontrol edilen condition sayisi 2 dir.
        if (num%2==0){
            System.out.println("Cift sayidir");
        }

        if (num%2!=0){
            System.out.println("Tek sayidir");
        }

        //2. Yol
        //Kontrol edilen condition sayisi 1 dir. bu yuzden bu yol tavsiye edilir.
        if (num%2==0){
            System.out.println("Cift sayidir");
        } else {//aksi halde
            System.out.println("Tek sayidir");
        }


    }
}
