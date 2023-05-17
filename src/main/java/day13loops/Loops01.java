package day13loops;

public class Loops01 {
    public static void main(String[] args) {

        //Ornek 1: Ekrana 5 kere "hi" yazdiriniz

        //1. Yol tavsiye edilmez
        System.out.println("Hi...");
        System.out.println("Hi...");
        System.out.println("Hi...");
        System.out.println("Hi...");
        System.out.println("Hi...");

        /*
        Code standarts
        1) Tekrar (Repetition) olmamalidir
        2) Dynamic olmalidir
        3) Tamir (Fix) ve update kolay yapilabilmelidir
         */

        //2. Yol
        //Ayni adimlar tekrar tekrar yapilmasi gerektiginde "Loop" lar kullanilir
        //Dort tane loop var a) for-loop b)while-loop c) do-while-loop d) for-each-loop

        //a)for-loop
        /*
        for(Baslangic degeri     ;  Loop 'un calisma sarti' (condition) ;   artirma/eksiltme (increment/decrement){
            //calisacak kodlar
        }
         */
        // i = i +1/ i+= / i++
        // Baslangic degeri  ; Loop 'un calisma sarti';   artirma/eksiltme

        for(   int i = 1     ;         i < 6          ;        i++       ){
            System.out.println("Hi");
        }

        //Ornek 2: 11 den 14 e kadar tum sayilari ekrana yazdiran kodu yaziniz..

        for (int x = 11; x < 15; x++){
            System.out.println(x);
        }

        //Ornek 3: 40 dan 23 e kadar tum cift sayilari ekrana yazdiriniz
        for (int y = 40 ; y > 22 ; y--){
            if(y % 2 == 0){
                System.out.print(y+" ");
            }
        }

        System.out.println();
        //Ornek 4: 18

        for(int i = 18; i < 57; i++){
            if (i % 2 != 0){
                System.out.print(i+" ");
            }
        }

    }
}
