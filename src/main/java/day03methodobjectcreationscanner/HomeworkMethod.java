package day03methodobjectcreationscanner;

public class HomeworkMethod {
    /*HOMEWORK
    1)Cemberin cevresini hesaplayan methodu olusturunuz ve kullaniniz.
    2)Dairenin alanini hesaplayan methodu olusturunuz ve kullaniniz.
     */

    public static void main(String[] args) {


        double r = 15;
        environmentCalc(r);

        double calcArea = circleArea(28);
        System.out.println(calcArea);

    }

    private static void environmentCalc(double r) {
        System.out.println(2 * r * 3.14);
    }

    protected static double circleArea(double r){
        return 3.14 * r * r;
    }


}
