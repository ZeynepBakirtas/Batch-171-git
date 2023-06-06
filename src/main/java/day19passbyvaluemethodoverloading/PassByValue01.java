package day19passbyvaluemethodoverloading;

public class PassByValue01 {
    public static void main(String[] args) {
        //Orjinal degerin korunmasini saglar ==> passbyvalue
        //Note: Java "pass by value" sayesinde variable larin orjinal degerlerini korur.
        int shirtPrice = 100;

        //Java methoda gonderirken orjinal degeri degil kopyasini gonderir ve degisen deger kopya deger olur
        System.out.println(discount("student", shirtPrice));//90
        System.out.println(discount("veteran", shirtPrice));//80
        System.out.println(discount("senior", shirtPrice));//95

        //nomalde indirim yaptik discount methodu ile ama buradeki deger hala orjinal
        System.out.println(shirtPrice);//100

        shirtPrice = discount("veteran", shirtPrice);
        System.out.println("shirtPrice kampanyasi= " + shirtPrice);//80
    }
    public  static int discount(String type, int price){
        switch (type){
            case "student":
                price -= 10;
                break;
            case "veteran":
                price -= 20;
                break;
            case "senior":
                price -= 5;
                break;
            default:
                price = price;//okununurluk icin yaziyoruz
        }
        return price;
    }
    /*
    Pass By Value:
    1) Java "pass by value" kullanir.
    2) Yani; java methodlarin orjinal degeri degistirmesine musade etmez.
    3) java methodlara deger yollarken orjinal degerin kopyasini olusturur. ve o kopyayi methoda yollar.
        Method kopya deger uzerinde degisiklik yapar, boylece orjinal deger korunmus oldu
    4) java esnek bir dildir. istersek yazdigimiz kod ile orjinal degerin degismesini de temin ederiz

    Pass by reference
    1) Methoda reference (adres) yollanir.
    2) Adres yollaninca method adresi kullanarak orjinal degere ulasir ve orjinal degeri degistir
    Bu yuzden "C#" gibi Pass by value reference kullanan dillerde method variable in orjinal degerini degistirir.
     */
}
