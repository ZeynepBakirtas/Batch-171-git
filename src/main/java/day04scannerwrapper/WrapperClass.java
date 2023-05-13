package day04scannerwrapper;

public class WrapperClass {

    public static void main(String[] args) {

        //primitive : char, boolean, byte, short, int, long, float, double
        //Wrapper Class: Character, Boolean, Byte, Short, Integer, Long, Float, Double

        //Wrapper class lar non-primitive dir. O yuzden memory de cok yer kaplarlar.
        //Dolayisi ile sart degilse wrapper class kullanmayi tercih etmeyiz.
        //n yazip nokta koyarsaniz hic method goremezsiniz cunku primitive ler method icermez
        int n = 12;

        //n yazip nokta koyarsaniz bir cok method gorebilirsiniz cunku wrapper classlar method icerir.
        Integer m = 12;

        byte p = 33;
        Byte r = 44;

        //Ornek: short data type nin min. max. degerlerini kod yazarak bulunuz.
        short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort);

        short minShort = Short.MIN_VALUE;
        System.out.println(minShort);

        //Ornek 2: int data type nin min. degeri ile byte data type nin max degerinin toplamini bulunuz

        int minInteger = Integer.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Toplam = " + (minInteger+maxByte));

        //Ornek 3: Primitive int i wrapper Integer a ceviriniz.
        int num = 12;
        Integer wrapperNum = num;
        System.out.println(wrapperNum);

        //Primitive den nun primitive cevirme islemine Autoboxing denir
        //Nun primitive den primitive cevirme islemine Unboxing denir

        //Ornek 4: Wrapper Byte i primitive byte a veviriniz.
        Byte k = 12;
        byte primitiveK = k;
        System.out.println(primitiveK);

        //Ornek 5 Primitive char i Wrapper Character e ceviriniz (Autoboxing)
        char x = '3';
        Character wrapperX = x;

        //Ornek 6 Wrapper Booleani primitive boolean a ceviriniz(Unboxing)
        Boolean isMarried = true;
        boolean primitiveIsMarried = isMarried;



    }



}
