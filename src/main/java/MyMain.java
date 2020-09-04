import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        int biggerAB = Math.max(a, b);
        int biggerAC = Math.max(a, c);

        if(biggerAB == biggerAC){   //if A is the biggest, then return the bigger out of B and C
            return Math.max(b, c);
        }else{
            return Math.min(biggerAB, biggerAC);
        }
    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        return (Math.abs(a) > Math.abs(b))? a : b;
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        return Math.sqrt(Math.pow(a,2) + Math.pow(b, 2));
    }

    public static void runMedian(){

    }
    public static void runMagnitude(){

    }
    public static void runPythagoras(){

    }

    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        System.out.println(median(1, 2, 3)); // should be 2
        System.out.println(magnitude(-7, -1)); // should be -7
        System.out.println(pythagoras(3, 4)); // should be 5.0

        Scanner scan = new Scanner(System.in);
        // YOUR CODE HERE

        String command = "";
        int a, b, c;
        while(true){
            System.out.println("What command would you like to carry out?");
            command = scan.next();
            a = 0;
            b = 0;
            c = 0;

            if("median".equals(command)){
                //takes three int inputs;
                System.out.println("Input first number:");
                a = scan.nextInt();
                System.out.println("Success. Input second number:");
                b = scan.nextInt();
                System.out.println("Success. Input third number:");
                c = scan.nextInt();
                
                System.out.println("Success. The median is: " + median(a, b, c));

                continue;

            }else if("magnitude".equals(command)){
                System.out.println("Input first number:");
                a = scan.nextInt();
                System.out.println("Success. Input second number:");
                b = scan.nextInt();

                System.out.println("Success. " + magnitude(a, b) + " has a bigger magnitude.");

                continue;
            }else if("pythagoras".equals(command)){
                System.out.println("Input first number:");
                a = scan.nextInt();
                System.out.println("Success. Input second number:");
                b = scan.nextInt();

                System.out.println("The hypoteneus has length " + pythagoras(a,b));
            }else if("exit".equals(command)){
                System.out.println("Thank you for using the program!");
                break;
            }
        } 
    }
}
