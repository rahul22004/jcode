class CommandLineDemo {
    public static void main(String args[]) {

        if (args.length != 2) {
            System.out.println("Enter 2 numbers");
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println("Sum = " + (a + b));

        if (a > b)
            System.out.println(a + " is largest");
        else if (b > a)
            System.out.println(b + " is largest");
        else
            System.out.println("Both are equal");

        System.out.println(a + (a % 2 == 0 ? " is Even" : " is Odd"));
        System.out.println(b + (b % 2 == 0 ? " is Even" : " is Odd"));
    }
}