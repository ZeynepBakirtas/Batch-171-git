package day13loops;

public class Loops02 {
    public static void main(String[] args) {

        //Ornek 1: 21 den 180 e kadar hem 2 hemde 3 ile bolunebilen tamsayilari ekrana yazdiriniz
        for (int i = 21; i<181; i++){
            if (i % 3 == 0 && i % 2 == 0){
                System.out.print(i+ " ");
            }
        }

        System.out.println();

        //Ornek 2: size verilen kucuk harfle yazilmis stringin index i cift sayi olan characterlerini buyuk harfe donusturen kodu yaziniz
        //     ankara ==> AKR

        String s = "ankara";

        for (int i = 0; i < s.length(); i++){
            if (i % 2 == 0) {
                String ch = s.substring(i, i + 1);
                System.out.print(ch.toUpperCase());
            }
        }

        System.out.println();
        //Ornek 3: Verilen bir stringte ilk a harfinden onceki tum karakterleri concole a yazdiriniz
        // " I love Java" ==> "I love J"

        String s1 = "I love Java";

        for (int i = 0; i < s1.length(); i++){
            char ch = s1.charAt(i);
            if (ch == 'a'){
                break;
            }
            System.out.print(ch);
        }
        //Loop icinde break okuyunca loop disina cikar, calismaya devam etmez.

        System.out.println();
        //Ornek 4: Verilen bir stringte son 'a' dan sonraki tum characterleri ters sirada yazdiriniz
        // "Germany" ==> yn

        String m = "Germany";

        for (int i = m.length() -1; i >= 0 ; i--) {
            char ch1 = m.charAt(i);
            if (ch1 == 'a'){
                break;
            }
            System.out.print(ch1);
        }


    }
}
