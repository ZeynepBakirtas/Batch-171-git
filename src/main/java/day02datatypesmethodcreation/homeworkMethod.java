package day02datatypesmethodcreation;

public class homeworkMethod {
    /*
   1) Dikdortgenin alanini hesaplayan methodu olusturun ve kullanin
   2) Dikdortgenin cevresini hesaplayan methodu olusturun ve kullaniniz
    */

    public static void main(String[] args) {
        int calculateRectangle = rectangleArea(10,23);

        System.out.println(calculateRectangle);
        System.out.println(rectangleEnvironment(7,9));
    }

    protected static int rectangleArea(int a, int b){
        return 2*(a+b);
    }

    private static int rectangleEnvironment(int c, int d){
        return c*d;
    }

}
