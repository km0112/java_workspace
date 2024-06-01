/*
  intro to standard input from the keyboard and standard output to the command line, using Scanner class
  for the former and various print functions for the latter.
  Author: Kaila
  Date:Sept. 2022
*/
//0- must import Scanner class
import java.util.Scanner;
public class InputOutputIntro
{ //If you type main, an autofill popup will come up and it will fill out other info (snippit)
  public static void main(String[] args)
  {
    //the "println" command is used for printing output to the command line
    //System.out.println used to invoke println method
    //println has a snippit type pl to autofill entire println method
    System.out.println("Line 1");
    System.out.println("Line 2");
    System.out.println("Line 3");
    /* println command is used for printing output to command line
    println automatically inserts an end of line character at the end of
    each line that it prints, which moves the cursor to the next line after the printing is done
    If you use print instead of println, it prints everything in a row
    */
    System.out.print("Line 6");
    System.out.print("Line 7");
    System.out.println();
    //You can't use print then not put anything in the quotations
    //To get input from the keyboard, use the Scanner class
    //1-create a Scanner abject (seen on line below)
    //2-prompt user w print statement
    //always place import statements before class definition
    //3-create a String variable to store the user input
    //4-get user input and store in String variable
    //5-print greeting
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Please enter your name:");
    String name;
    name = keyboard.nextLine();
    System.out.println("Hi There " + name + "!");
    //ask for home town
    System.out.print("Where do you live?");
    String hometown = keyboard.nextLine();
    System.out.println("You live in "+ hometown);
    //#of siblings
    System.out.print("How many siblings do you have? ");
    int siblings = keyboard.nextInt();
    System.out.println("You have " + siblings + " siblings");
    keyboard.nextLine();
    //next question does not work bc when you input an int, it hangs in input stream.
    //code line above this fixes that
    //favorite color
    System.out.print("Please enter your favorite color: ");
    String color = keyboard.nextLine();
    System.out.println("You like the color " + color);

    //nextLine is a method of the Scanner class can tell bc of parentheses
    //methods of Scanner class:
    //close the Scanner object
    keyboard.close();



  }
}
