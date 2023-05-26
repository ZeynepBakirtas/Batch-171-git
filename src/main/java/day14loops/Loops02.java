package day14loops;

public class Loops02 {
    public static void main(String[] args) {
        //Ornek 1: 5 den 8 e kadar tamsayilarin toplamini veren kodu yaziniz
        // 5+6+7+8 ==> 26

        int sum = 0;

        for (int i = 5; i < 9; i++) {
            sum += i;
        }

        System.out.println(sum);

        //Ornek 2: 7 den 9 a kadar tam sayilarin carpimini veren kodu yaziniz
        // 7*8*9

        int multiply = 1;

        for (int i = 7; i < 10 ; i++) {
            multiply *= i;
        }

        System.out.println(multiply);

        //Ornek 3: Verilen bir tamsayinin rakamlarinin toplamini veren kodu yaziniz
        // 578  ==> 5 + 7 + 8 = 20

        int toplam = 0;
        int num = -578;
        num = Math.abs(num);

        for (int i = num; i > 0 ; i/=10) {
            toplam = toplam + i % 10;
        }

        System.out.println(toplam);

    }
}
