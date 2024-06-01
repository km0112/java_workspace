//This program conducts an interview by asking 10 questions and storing the answers. 2 int responses
//2 floating point responses
//After all the questions are answered, the program summarizes the responses.

//author:Kaila McNamara
//Date: Oct.2022

import java.util.Scanner;

public class interview
{
  public static void main(String[] args)
  {   Scanner reply = new Scanner(System.in);
    System.out.print("Please enter your name:");
    String name;
    name = reply.nextLine();

    System.out.print("What was your favorite subject in school?");
    String school;
    school = reply.nextLine();

    System.out.print("How old are you?");
    String age;
    age = reply.nextLine();

    System.out.print("What is your favorite pet?");
    String pet;
    pet = reply.nextLine();

    System.out.print("What is your favorite sport?");
    String sport;
    sport = reply.nextLine();

    System.out.print("What superpower would you want if you can only have one?");
    String powers;
    powers = reply.nextLine();

    System.out.print("What coding language are you best at?");
    String coding;
    coding = reply.nextLine();

    System.out.print("Please list all the digits of pi that you remember");
    String pie;
    pie = reply.nextLine();

    System.out.print("How many countries have you been to?");
    String visits;
    visits = reply.nextLine();

    System.out.print("Please enter your favorite decimal number");
    String deci = reply.nextLine();

    System.out.println("Interviewee "+ name);
    System.out.println("Favorite subject: "+ school);
    System.out.println("Age: "+ age);
    System.out.println("Favorite pet: "+ pet);
    System.out.println("Favorite sport: "+ sport);
    System.out.println("Favorite number: "+ deci);
    System.out.println("Has been to "+ visits +" countries");
    System.out.println("Remembers up to "+ pie +" in digits of pi");
    System.out.println("Best coding language: "+ coding);
    System.out.println("Wants to have "+ powers +" power");







    reply.close();


  }

}
