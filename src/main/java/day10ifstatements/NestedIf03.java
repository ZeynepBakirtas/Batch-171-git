package day10ifstatements;

import java.util.Scanner;

public class NestedIf03 {
    public static void main(String[] args) {

        /*
                    Password'un ilk harfi buyuk harf ise
                    'A' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                    Adana ==> Gecerli

                    Passwordun ilk harfi kucuk harf ise
                    'z' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                    zehirli ==> Gecerli
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Password giriniz");
        String pwd = input.nextLine();

        if (pwd.charAt(0) >= 'A' && pwd.charAt(0) <= 'Z'){//Password'un ilk harfi buyuk harf ise
            if(pwd.charAt(0) == 'A'){
                System.out.println("Gecerli password");
            }else {
                System.out.println("Gecersiz password cunku buyuk harf ama A degil");
            }
        } else if (pwd.charAt(0) >= 'a' && pwd.charAt(0) <= 'z') {//Passwordun ilk harfi kucuk harf ise
            if (pwd.charAt(0) == 'z'){
                System.out.println("Gecerli password");
            }else {
                System.out.println("Gecersiz password cunku kucuk harf ama z degil");
            }
        }else{
            System.out.println("Ilk karakter harf olmalidir.");
        }


    }
}
