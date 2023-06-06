package day20statickeywordconstructors;

public class StdRunner {
    public static void main(String[] args) {
        //stdName static oldugundan ona ulasmak icin object olusturmadan sadece class ismini kullanmak yeterlidir.
        System.out.println(Student.stdNames);


        //age non-static oldugundan ona ulasmak icin object olusturmak zorundayiz
        Student std1 = new Student();
        System.out.println(std1.age);

        Student.staticMethod();//Kafasini kaldirip aya bakiyor: static
        std1.nonStaticMethod();// Student.staticMethod();//
    }
}
