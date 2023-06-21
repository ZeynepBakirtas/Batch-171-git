package day23datetimevarargs;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestingDateTime {
    public static void main(String[] args) {
        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //           Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yil, ay ve gun giriniz");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        LocalDate wantDate = LocalDate.of(year, month, day);

        if (wantDate.isBefore(LocalDate.now())) {
            System.out.println("Invalid date");
        } else {
            System.out.println("You can enter time");
        }

        //Example 2: Kullanicinin girdigi tarihin gun ismini bulan kodu yaziniz

        System.out.println("Day = " + wantDate.getDayOfWeek());//Day = WEDNESDAY

        //Date formati nasil degistirilir?

        LocalDate myDate = LocalDate.of(1998, 10, 05);

        //Tarihi AY/GUN/YIL sekline ceviriniz
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM, dd, yyyy");

        String newMyDate = myDate.format(dtf);
        System.out.println(newMyDate);//10, 05, 1998

    }
}
