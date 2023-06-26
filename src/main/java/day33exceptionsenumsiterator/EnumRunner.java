package day33exceptionsenumsiterator;

public class EnumRunner {

    public static void main(String[] args) {

        //Enum daki bir sabite nasil ulasabiliriz?
        System.out.println(Cities.AYDIN);
        Cities hatay = Cities.HATAY;//Enumlarin variable lari classlarinin kavonozuna koyariz. data type i class adi olur.
        System.out.println(hatay);

        //Agri sabitinin ismine ulasalim
        String agriCityNameCities = Cities.AĞRI.getCityName();
        System.out.println(agriCityNameCities);

        //Istanbul plaka koduna ulasalim
        int istanbulPlateCode = Cities.İSTANBUL.getPlateCode();
        System.out.println(istanbulPlateCode);

        //Ankaranin posta koduna ulasalim
        String ankaraPostalCode = Cities.ANKARA.getPostalCode();
        System.out.println(ankaraPostalCode);//06000



    }
}
