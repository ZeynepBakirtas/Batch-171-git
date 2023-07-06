package day23datetimevarargs;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {
/*
        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //           Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year month, and day numbers in the given order");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        LocalDate givenDate = LocalDate.of(year, month, day);
        System.out.println("givenDate = " + givenDate);//givenDate = 1998-06-10


        if (givenDate.isBefore(LocalDate.now())){
            System.out.println(givenDate + " invalid date");
        } else {
            System.out.println("Enter time for ticket");
        }

 */
Scanner input = new Scanner(System.in);
        //Example 2: Kullanicinin girdigi tarihin gun ismini bulan kodu yaziniz

        System.out.println("Please enter year month, and day numbers in the given order");
        int y = input.nextInt();
        int m = input.nextInt();
        int d = input.nextInt();

        LocalDate date = LocalDate.of(y,m,d);
        System.out.println(date.getDayOfWeek());
    }
}
