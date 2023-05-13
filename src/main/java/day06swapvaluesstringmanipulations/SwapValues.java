package day06swapvaluesstringmanipulations;

public class SwapValues {
    public static void main(String[] args) {
        //Swap: yer degistirmek demektir. 1. kap patates 2. kap domates ==> swap islemi => 1. kap domates 2. kapta patates

        int a = 12;
        int b = 5;// Swap den sonra ==> a=5, b=12;
        int temp;

        System.out.println("b = " + b);
        System.out.println("a = " + a);

        //1. Adim
        temp = a;
        System.out.println(a);// a=12
        //2. Adim
        a = b;
        //3. Adim
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //2. yol
        int elma = 12;
        int armut = 5;

        System.out.println("armut = " + armut);
        System.out.println("elma = " + elma);

        elma = elma + armut;
        armut = elma - armut;
        elma = elma - armut;

        System.out.println("armut = " + armut);
        System.out.println("elma = " + elma);







    }


}
