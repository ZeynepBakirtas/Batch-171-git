package day23datetimevarargs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
        //Anlik zamani nasil aliriz?
        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime);//20:02:08.145894

        //Anlik zamanda bilesenler nasil alinir?
        int hour = myCurrentTime.getHour();
        System.out.println("hour = " + hour);

        int nano = myCurrentTime.getNano();
        System.out.println("nano = " + nano);//105026000 ==> salise

        int minute = myCurrentTime.getMinute();
        System.out.println("minute = " + minute);

        int second = myCurrentTime.getSecond();
        System.out.println("second = " + second);

        //Gelecek ve gecmise nasil gidilir?
        LocalTime next = myCurrentTime.plusMinutes(13).plusHours(3).minusMinutes(13).minusHours(3);
        System.out.println(next);

        //Zaman formati nasil degistirilir?
        /*
        DateTime class ta kullanilan tarih saat formatlari
        HH : mm ==> 24 lu saat sistemi
        hh : mm ==> 12 li saat sistemi
        hh : mm a ==> 12 li saat sistemi AM, PM gosterilir
        HH : mm : ss ==> 24 lu saat sistemi
        HH : MM ==> yanlis fomat MM aylar icin kullanilir
        "mm" minute demektir, "MM" months demektir.

        dd-MM-yyyy ==> gun ay yil
        MMM ==> Aug
        MMMM ==> August
         */
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH : mm");
        String formattedMyCurrentTime = dtf1.format(myCurrentTime);
        System.out.println("formattedMyCurrentTime = " + formattedMyCurrentTime);//formattedMyCurrentTime = 13 : 03

        //Date formati nasil degistirilir?
        LocalDate myDate = LocalDate.of(2023,8,13);
        System.out.println(myDate);//2023-08-13

        //Tarihi AY/GUN/YIL sekline ceviriniz
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedMyDate = dtf2.format(myDate);
        System.out.println("formattedMyDate = " + formattedMyDate);//formattedMyDate = 08/13/2023

        //Baska bir zaman dilimindeki tarih ve zamani nasil alabiliriz
        LocalDate dateInTokya = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("dateInTokya = " + dateInTokya);//2023-06-12

        //Amsterdam da ayin kaci?
        LocalDate dataInAmsterdam = LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println("dataInAmsterdam = " + dataInAmsterdam);

        //Tokyada saat kac?
        LocalTime timeInTokya = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("timeInTokya = " + timeInTokya);//2023-06-12

        //Berlinde saat kac?
        LocalTime timeInBerlin = LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println("timeInBerlin = " + timeInBerlin);
    }
}
