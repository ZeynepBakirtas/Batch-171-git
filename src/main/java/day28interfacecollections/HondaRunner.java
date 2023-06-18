package day28interfacecollections;

public class HondaRunner {
    public static void main(String[] args) {
        Civic myCivic = new Civic();
        myCivic.cool();//Civic cool super
        myCivic.run();//AC runs super

        Accord myAccord = new Accord();
        myAccord.cool();//Accord cool super
        myAccord.run();//Engine runs super
        myCivic.eco();//Uses gas less

        Engine.stop();//Stop securely


        System.out.println("AC price: " + Ac.price);//AC price: 2000
        System.out.println("Engine price: " + Engine.price);//Engine price: 3000
        System.out.println("Security price: " + Security.price);//Security price: 5000

    }
}
