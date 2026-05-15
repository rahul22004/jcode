import java.io.*;
import java.util.Scanner;
class StudentFile {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {   // Write into file
            FileWriter fw = new FileWriter("student.txt");
            System.out.print("Enter Roll No : ");
            int roll = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name : ");
            String name = sc.nextLine();
            System.out.print("Enter Marks : ");
            int marks = sc.nextInt();
            fw.write("Roll No : " + roll + "\n");
            fw.write("Name : " + name + "\n");
            fw.write("Marks : " + marks + "\n");
            fw.close();
            System.out.println("\nData Written Successfully");
            // Read file
            FileReader fr = new FileReader("student.txt");
            int ch;
            System.out.println("\nStudent Information:");
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}