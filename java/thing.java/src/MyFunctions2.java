import java.util.Scanner;

public class MyFunctions2 {

    public static void main(String[] args) {

        double input;
        // Connect to Keyboard input
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a number ");
        input = keyboard.nextDouble();

        // Test all conditions
        foo(input);
    }

    private static String foo(double N) {

        // Validate keyboard input
        System.out.println("Keyboard Input:" + N);

        // Declare all local variables
        // 1. create a string called star and set to "*"
        String star = "*";
        // 2. create a string called excl and set to "!"
        String excl = "!";
        // Create comparison value of zero for the negative and positive responses
        double zero = 0.0;
        // 5. create  a variable called negative and set to false
        boolean negative = false;
        // 4. create a string called result and set to the empty string
        String result = "";

        // 3. if N is zero, return star
        if (N == zero) {
            result = star;
            System.out.println("Input is exactly equal to zero, result = " + result);
        }

        //7b. set N to half of itself
        N = N / 2;

        //8. if negative is true return "<" + result
        if (N < zero) {
            result = "<" + result;
            System.out.printf("INPUT NUMBER IS NEGATIVE, result =" + result);
        }

        //3. if N equals one -> return true
        if (N == 1.0) {
            result = String.valueOf(true);
        } else {
            result = String.valueOf(false);
        }

        // 5a. if N is negative, set negative to true
        if (N < zero) {
            negative = true;
            System.out.printf("negative=" + negative);
        }

        //6. set N to its own absolute value
        N = Math.abs(N);

        //7. while N is positive
        if (N >= zero) {
            //7ai. if N is even set result to star + result
            if (N % 2 == 0) {
                result = star + result;
                System.out.println("Input is an even number, result=" + result);
                //7aii. otherwise set result to excl + result
            } else {
                result = excl + result;
                System.out.println("Input is an odd number, result=" + result);
            }

            //9. return result
            System.out.println("Result =" + result);
        }
        return result;
    }

}
//3a. otherwise -> false
