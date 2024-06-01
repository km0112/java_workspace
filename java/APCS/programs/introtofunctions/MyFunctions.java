// import java.util.Scanner;
//
//public class MyFunctions
// {
//   //method that returns a greeting string customized
//   //with a name and greeting
// /*  public static String greet(String name, String greeting)
//  {
//    String result;
//    result = greeting + ", " + name + "!";
//
//    return result;
//  }
// }
// //you can't run this one but you can use functions in it in other programs
// //
//
// //returns true if N is even and false otherwise
// //precondition: input an integer for N
//
//
// public boolean isEven(int N)
// {
//   //if remainder from dividing N by 2 is zero-> true
//   if(N % 2 == 0)
//   return true;
//
//   else
//   return false;
// }
// //Code below gives an error because Java scans code and realizes both can be false
// //even though we know it won't
// /*
// Public boolean isEven(int N)
// {
//   //if remainder from dividing N by 2 is zero-> true
//   if(N % 2 == 0)
//   return true;
//   if(N % 2 != 0)
//   {return false;}
// }
// */
// public static boolean mystery(int N)
// {
//   //1. define an int called f and set to the square root of n
//   int f = (int) Math.sqrt(N);
//   //2. while N does not divide evenly by f
//   while (N % f != 0)
//       //2a. decrease f by 1
//     {f--;}
//   if (f == 1)
//    return true;
//  else
//    return false;
// }
//
// //create a function for algorithm
// // precondition: none (N can be any integer)
// public static String foo(intN)
// {
//   // 1. create a string called star and set to "*"
//   String star = "*";
// // 2. create a string called excl and set to "!"
//   String excl = "!";
// // 3. if N is zero, return star
//   Scanner keyboard = new Scanner(System.in);
//   System.out.print("Please enter a number ");
//   double N = keyboard.nextInt();
//
//   if (double N = 0.0);
//   {
//     return star;
//   }
//
// // 4. create a string called result and set to the empty string
//   String result = "";
// // 5. create  a variable called negative and set to false
//   Boolean negative = false;
// // 5a. if N is negative, set negative to true
//   if (double N; < double 0.0)
//   {
//     return !negative;
//   }
// //6. set N to its own absolute value
//   double N = math.abs(N);
// //7. while N is positive
//   while (double N; >= 0.0)
//   {//7ai. if N is even set result to star + result
//     if (double N % 2 = 0)
//     {
//       String result
//       result = star + result;
// //7aii. otherwise set result to excl + result
//     else
//     {
//       result = excl + result;
//         }
//       }
//     }
//
// //7b. set N to half of itself
//   double N;
//   N = N/2;
// //8. if negative is true return "<" + result
//   if (double N < double 0.0)
//   {
//     String result = "<" + result;
//     return result;
// }
// //9. return result
//
//
//
//   //3. if N equals one -> true
//  if ( double N == 1.0)
//  {
//    return true;
//
//  }
// else
//   {return false};
// }
  //3a. otherwise -> false
  import java.util.Scanner;

    public class MyFunctions
    {
        private static Object Boolean;
        //private static Boolean;

        //method that returns a greeting string customized
        //with a name and greeting
/*  public static String greet(String name, String greeting)
 {
   String result;
   result = greeting + ", " + name + "!";

   return result;
 }
}
//you can't run this one but you can use functions in it in other programs
//

//returns true if N is even and false otherwise
//precondition: input an integer for N


public boolean isEven(int N)
{
  //if remainder from dividing N by 2 is zero-> true
  if(N % 2 == 0)
  return true;

  else
  return false;
}
//Code below gives an error because Java scans code and realizes both can be false
//even though we know it won't
/*
Public boolean isEven(int N)
{
  //if remainder from dividing N by 2 is zero-> true
  if(N % 2 == 0)
  return true;
  if(N % 2 != 0)
  {return false;}
}
*/public static void main(String[]args)
      {
        //public static boolean mystery(int N)
        //{
            //1. define an int called f and set to the square root of n
          //  int f = (int) Math.sqrt(N);
            //2. while N does not divide evenly by f
          //  while (N % f != 0)
            //2a. decrease f by 1
          //  {f--;}
          //  return f == 1;
      //  }

        //create a function for algorithm
// precondition: none (N can be any integer)
        public static <v> String foo(double N)
        {
            // 1. create a string called star and set to "*"
            String star = "*";
// 2. create a string called excl and set to "!"
            String excl = "!";
// 3. if N is zero, return star
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Please enter a number ");
            N = keyboard.nextInt();

            final double v;
            v = 0.0;
            if (N == v)
            {
                return star;
            }

// 4. create a string called result and set to the empty string
            String result = "";
// 5. create  a variable called negative and set to false
            boolean b = false;
            Boolean negative = b;
// 5a. if N is negative, set negative to true
            if ( N < v)
            {
                return String.valueOf(true);
            }
//6. set N to its own absolute value
            N = Math.abs(N);
//7. while N is positive
            while (N >= v)
            {//7ai. if N is even set result to star + result
                if (N % 2 == 0)
                result = star + result;
//7aii. otherwise set result to excl + result
                   else
                {
                    result = excl + result;
                }
            }

//7b. set N to half of itself

            N = N/2;
//8. if negative is true return "<" + result
            if (N < v)
            {
                String s = "<" + ("<" + result);
                return s;
            }
//9. return result



            //3. if N equals one -> true
            if ( N == 1.0)
            {
                return String.valueOf(true);

            }
            else
            {return String.valueOf(b);}
        }
        //3a. otherwise -> false
}
