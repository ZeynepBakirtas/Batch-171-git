package day10ifstatements;

import java.util.Scanner;

public class Homework {

   public static void main(String[] args) {

      //1)Kullanicidan alinan password 'pwd123!' oldugunda, verilen password'un dogru olup
      //olmadigini kontrol eden ve kullaniciya uygun mesaj veren kodu yaziniz
      Scanner input = new Scanner(System.in);
      System.out.println("Please entry password");
      String pwd = input.nextLine();

      if(pwd.equals("pwd123!")){
         System.out.println("Correct answer!");
      } else {
         System.out.println("Invalid answer!");
      }

      //2) Haftanin gün ismini verdiginizde kacinci gün oldugunu yazan kodu yaziniz
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter a day");
      String day = scan.next();

      if(day.equalsIgnoreCase("Monday")){
         System.out.println("1. gun");
      } else if (day.equalsIgnoreCase("Tuesday")) {
         System.out.println("2. gun");
      }else if (day.equalsIgnoreCase("Wednesday")) {
         System.out.println("3. gun");
      }else if (day.equalsIgnoreCase("Thursday")) {
         System.out.println("4. gun");
      }else if (day.equalsIgnoreCase("Friday")) {
         System.out.println("5. gun");
      }else if (day.equalsIgnoreCase("Saturday")) {
         System.out.println("6. gun");
      }else if (day.equalsIgnoreCase("Sunday")) {
         System.out.println("7. gun");
      }else {
         System.out.println("Please enter a valid day!");
      }


      //3)Ay sayisini verdiginizde ay ismini yazan kodu yaziniz
      //  1==> January, 2 ==> February .....
      Scanner inputMonth = new Scanner(System.in);
      System.out.println("Please enter a number between 1-12");
      int month = inputMonth.nextInt();

      if (month==1){
         System.out.println("January");
      } else if (month==2) {
         System.out.println("February");
      }

      if (month==1){
         System.out.println("January");
      } else if (month==2) {
         System.out.println("February");
      } else if (month==3) {
         System.out.println("March");
      } else if (month==4) {
         System.out.println("April");
      } else if (month==5) {
         System.out.println("May");
      } else if (month==6) {
         System.out.println("Jun");
      } else if (month==7) {
         System.out.println("July");
      } else if (month==8) {
         System.out.println("August");
      } else if (month==9) {
         System.out.println("September");
      } else if (month==10) {
         System.out.println("October");
      } else if (month==11) {
         System.out.println("November");
      } else if (month==12) {
         System.out.println("December");
      } else {
         System.out.println("Invalid number!");
      }

   }
}
