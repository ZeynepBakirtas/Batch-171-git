package day02datatypesmethodcreation;

public class Variables01 {
    public static void main(String[] args) {
        //Ornek 1:Sehir ismi icin bir variable olusturun ve once "Ankara" sonrada "Izmir" degerlerini atayip ekrana yazdirin
        String cityName = "Ankara";
        System.out.println(cityName);

        cityName = "Izmir";
        System.out.println(cityName);

        //Ornek 2: Sehir plaka kodu icin bir variable olusturun once 34 sonrada 35 degeri atayip console yazdirin.
        byte plakaKodu = 34;
        System.out.println(plakaKodu);

        plakaKodu = 35;
        System.out.println(plakaKodu);

        //Ornek 3: Basarili mi? sorusu icin bir variable olusturun ve once "false" sonrada "true" degeri atayip ekrana yazdirin
        boolean isSuccessful = false;
        System.out.println(isSuccessful);

        isSuccessful = true;
        System.out.println(isSuccessful);
    }
}
