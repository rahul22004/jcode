package Employee;

public class Emp {

    String name;
    int id;
    double basic, hra, da, net;

    // Constructor
    public Emp(String n, int i, double b) {

        name = n;
        id = i;
        basic = b;
    }

    // Calculate Salary
    public void calculate() {

        hra = basic * 0.20;
        da = basic * 0.10;

        net = basic + hra + da;
    }

    // Display
    public void display() {

        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Salary : " + basic);
        System.out.println("HRA : " + hra);
        System.out.println("DA : " + da);
        System.out.println("Net Salary : " + net);
    }
}