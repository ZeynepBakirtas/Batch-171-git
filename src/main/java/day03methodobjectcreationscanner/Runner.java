package day03methodobjectcreationscanner;

public class Runner {


    public static void main(String[] args) {

        //Object nasil olusturulur

        //new keywordu sifirdan yeni bir object olusturmak icin kullanilir.
        //constructor java da objeleri olusturmak icin kullanilan ozel bir methodtur.
        //Class ismi  +  object ismi  +  assigment operator  +  "new" keyword  +  constructor
              Car         myCar                 =                      new           Car();
        System.out.println("myCar.fiyat = " + myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);
        myCar.hareket();


        Student aliCan = new Student() ;

        System.out.println("aliCan.name = " + aliCan.name);
        System.out.println("aliCan.adress = " + aliCan.adress);
        System.out.println("aliCan.grade = " + aliCan.grade);
        aliCan.study();
        aliCan.feed();

        HomeworkRunner teacher = new HomeworkRunner();
        System.out.println("teacher.name = " + teacher.name);
        System.out.println("teacher.old = " + teacher.old);
        teacher.teach();


    }


}
