package day23datetimevarargs;

public class Varargs01 {
    public static void main(String[] args) {

        System.out.println(add(2, 3, 4, 5));//14

        //Asagidaki gibi farkli methodlar olusturarak is yapamayiz
        //Cunku kullanici farkli sayidaki sayilari toplamak isteyebilir
        //Her ihtimal icin bir method olusturmak mumkun degildir
        //Java farkli sayidaki parametrelerin hepsini kabul eden bir yapi olusturdu.
        //Bu yapiya Varargs denir
        //Varargs arkada Array yapisini kullanir

    }

    //NOTE 1: Bir method parantezinde birden fazla Varargs kullanilamaz
    //NOTE 2: Eger bir method parantezinde birden fazla parametre kullanilacaksa Varargs sonda olmalidir
    public static int add(int... a){//array gibi dusunucez
        int sum = 0;//hic bir sey gondermedigimizde 0 verir.
        for (int w: a) {
            sum += w;
        }
        return sum;
    }
//toplama islemi yapan method olusturunuz?
    /*
    public static int add(int a, int b) {
        return a+b;
    }
    public static int add(int a, int b, int c) {
        return a+b+c;
    }
    public static int add(int a, int b,int c, int d) {
        return a+b+c+d;
    }
     */
}
