// Java Program to Demonstrate Command Line Arguments
// Operations: Sum, Largest Number, Odd/Even

class CommandLineDemo {
    public static void main(String args[]) {

        // Check if exactly 2 arguments are passed
        if (args.length != 2) {
            System.out.println("Please enter exactly 2 numbers.");
            return;
        }

        // Convert command line arguments to integers
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Sum
        int sum = num1 + num2;
        System.out.println("Sum = " + sum);

        // Find Largest
        if (num1 > num2) {
            System.out.println(num1 + " is the largest number.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the largest number.");
        } else {
            System.out.println("Both numbers are equal.");
        }

        // Check Odd/Even
        if (num1 % 2 == 0) {
            System.out.println(num1 + " is Even.");
        } else {
            System.out.println(num1 + " is Odd.");
        }

        if (num2 % 2 == 0) {
            System.out.println(num2 + " is Even.");
        } else {
            System.out.println(num2 + " is Odd.");
        }
    }
}