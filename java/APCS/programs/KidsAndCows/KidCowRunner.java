
import java.util.Scanner;

public class KidCowRunner
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("How many cows? ");
    int cows = in.nextInt();
    in.nextLine();
    System.out.print("How many kids? ");
    int kids = in.nextInt();
    System.out.println();

    KidsCows.drawCows(cows);
    KidsCows.drawKids(kids);
    KidsCows.showCombos(cows * 4 + kids * 2);
  }
}
