package day33exceptionsenumsiterator;

public class InvalidStudentGradeException extends Exception {//Exception classin childi, parentin ozelliklerini kullanabilmek
    //icin olusturduk

    /*
    1) Custom Exception Class olusturmak icin Exception class extends etmeliyiz
        Exception class a extend ederek olusturdugumuz Custom Exception "Compile Time Exception" olur
        Eger Run Time Exception uretmek istersek RunTimeException class a extend etmeliyiz
    2) Custom Exception class olustururken constructor olusturmaliyiz
        Bu constructor parent taki constructor u cagirmalidir ve mesaj verecek veya vermeyecek sekilde olusturulabilir
    3) Custom Exception Class olusturdugumuzda ismin sonuna Exception kelimesinin kullanmalisiniz, (naming convention)
     */


    public InvalidStudentGradeException (String message){
        super(message);
    }

// Uygulama donsun diye method yanina throws koyduk


}
