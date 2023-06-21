package day20statickeywordconstructors;

public class TeacherRunner {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Ali Can", 40, "Istanbul");
        Teacher t2 = new Teacher("Veli Han", 41);

        System.out.println(t1);//Teacher{name='Ali Can', age=40, address='Istanbul'}
        System.out.println(t2);//Teacher{name='Veli Han', age=41, address='null'}

    }
}
