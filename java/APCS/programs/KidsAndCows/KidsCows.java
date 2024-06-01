
public class KidsCows
{
  private static final String SPACE = " ";

  // shows all of the possible combinations of
  // kids (2-footed) and cows (4-footed) for totalFeet feet
  Scanner.keyboard = new Scanner;
  int totalFeet = keyboard.nextInt;
  public static void showCombos(int totalFeet)
  {
    // to be written
    //if it's possible to have all cows
while(totalFeet >= 0; totalFeet - 4;)
  int kids = 0
  int cows = 0
    if (totalFeet % 4 = 0;)
    {
      
    }
  }

  // returns true if given totalFeet feet and totalHeads heads,
  // there is some combo of cows and kids that satisfies this, false ow
  public static boolean isValidCombo(int totalFeet, int totalHeads)
  {
    // replace stub below with valid solution
    return false;
  }

  // returns true if C cows and K kids have totalFeet feet, false ow
  public static boolean isValid(int totalFeet, int C, int K)
  {
    // replace stub below with valid solution
    return false;
  }

  // draws a line of length L of tokens
  private static String line(int L, String token)
  {
    String result = "";
    for(int n = 0; n < L; n++){ result += token; }
    return result;
  }

  // draws n ASCII cows
  public static void drawCows(int n)
  {
    String[] bodyParts = new String[6];
    bodyParts[0] = line(9, SPACE) + "(__)" + SPACE;
    bodyParts[1] = line(9, SPACE) + "(oo)" + SPACE;
    bodyParts[2] = line(2, SPACE) + "/" + line(7, "-") + "\\/" + line(2,SPACE);
    bodyParts[3] = SPACE + "/" + SPACE + "|" + line(5,SPACE) + "||" + line(3,SPACE);
    bodyParts[4] = "*" + line(2,SPACE) + line(2,"|") + line(4,"-") + line(2,"|") + line(3,SPACE);
    bodyParts[5] = line(3,SPACE) + line(2,"^") + line(4,SPACE) + line(2,"^") + line(3,SPACE);

    for(String bodyPart : bodyParts)
    {
      for(int i = 0; i < n; i++)
      { System.out.print(bodyPart);}
      System.out.println();
    }
  }

  // draws n ASCII kids
  public static void drawKids(int n)
  {
    String top = SPACE + "O" + SPACE + SPACE;
    String mid = "/" + "H" + "\\" + SPACE;
    String bot = "/" + SPACE + "\\" + SPACE;
    String[] bodyParts = {top, mid, bot};

    String result = "";
    for(String bodyPart : bodyParts)
    {
      for(int i = 0; i < n; i++)
      { System.out.print(bodyPart);}
      System.out.println();
    }
  }

}
