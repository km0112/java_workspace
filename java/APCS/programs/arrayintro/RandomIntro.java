import java.util.Random;
public class RandomIntro
{
  public static void main(String[] args)
  {
    //Math.random() generates a pseudo-random number in [0,1]
    //it resides in java.lang
//    double a = -3.4, b = 2*Math.PI;
//    System.out.println("random numbers from [" + a + "," + b + "]");
//    for(int i = 0; i <10 ; i++)
//    {
//      System.out.println(a + (b-a) * Math.random());
//    }

  //if we put a number in parenthases after Random, it generates same sequence over and over
  //this is called seeding the Random number generated
  //if you don't do this, it choses a random seed
    Random rgen = new Random(9);
    int c = -3, d = 27;
    for(int i = 0; i <10 ; i++)
    {
    System.out.println(c + rgen.nextInt(d-c));
    }
  }

}
