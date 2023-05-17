package day09ifstatements;

public class IfStatements01 {
    public static void main(String[] args) {

        //Ornek 1: sayi uc basamakli ise ekrana "Sayi uc basamaklidir!" yazdirin.

        int number = 123;
        number = Math.abs(number);//mutlagini aldik

        if(number>99 & number<1000){
            System.out.println("Sayi uc basamaklidir!");
        }

        //Ornek 2:Bir stringdeki tekrarsiz karakterleri yazdiriniz
        //aabbbj ==> abj
        String str = "aac";

        char ch1 = str.charAt(0);
        if(str.indexOf(ch1)==str.lastIndexOf(ch1)){
            System.out.println(ch1);
        }

        char ch2 = str.charAt(1);
        if(str.indexOf(ch2)==str.lastIndexOf(ch2)){
            System.out.println(ch2);
        }

        char ch3 = str.charAt(2);
        if(str.indexOf(ch3)==str.lastIndexOf(ch3)){
            System.out.println(ch3);
        }

    }
}
