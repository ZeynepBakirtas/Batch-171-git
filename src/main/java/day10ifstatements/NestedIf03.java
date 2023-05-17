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

        char firstChar = pwd.charAt(0);

        if (firstChar >= 'A' && firstChar <= 'Z'){//Password'un ilk harfi buyuk harf ise
            if(firstChar == 'A'){
                System.out.println("Gecerli password");
            }else {
                System.out.println("Gecersiz password cunku buyuk harf ama A degil");
            }
        } else if (firstChar >= 'a' && firstChar <= 'z') {//Passwordun ilk harfi kucuk harf ise
            if (firstChar == 'z'){
                System.out.println("Gecerli password");
            }else {
                System.out.println("Gecersiz password cunku kucuk harf ama z degil");
            }
        }else{
            System.out.println("Ilk karakter harf olmalidir.");
        }

        //Note: eger bir metodu tekrar tekrar kullanmak istiyorsaniz onu bir variable a atayarak kullanmak daha makul olur.



    }
}
