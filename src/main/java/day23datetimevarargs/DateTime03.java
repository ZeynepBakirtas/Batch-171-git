package day23datetimevarargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime03 {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);//2023-06-12T08:59:51.737392==> T date ve time i ayiriyor

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy  hh:mm");
        String formattedLdt = dtf.format(ldt);
        System.out.println(formattedLdt);//06/12/2023  09:03
    }
}
