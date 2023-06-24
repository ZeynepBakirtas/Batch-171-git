package day32exceptions;

public class E03 {

    /*
    throw keyword bir methodun body si icinde istedigimiz yerde, istedigimiz kosullar icin
    istedigimiz kadar Exception atmamizi saglar

    throw keyword yazildiktan sonra bir exception class objecti olusturulur

    Exception class constructor inin parantezi icine istediginiz
     */
    public static void main(String[] args) {

        //calismaya devam etmesini istiyorsak try catch kullaniyoruz.
        try{
            printAge(-63);
        } catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }

    }

    public static void printAge(int age){
        if(age<0){
            throw  new IllegalArgumentException("Age cannot be negative");
        }else {
            System.out.println(age);

        }
    }
}
