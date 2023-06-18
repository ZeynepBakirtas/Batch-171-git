package day25inheritance;

public class AnimalRunner {
    public static void main(String[] args) {

        Cat c1 = new Cat();
        c1.eat();
        c1.drink();
        c1.meow();

        Dog c2 = new Dog();
        c2.bark();
        c2.drink();
        c2.eat();

        Bird c3 = new Bird();
        c3.tweet();
        c3.drink();
        c3.eat();



    }
}
