import java.util.Scanner;


class MarksOutOfBoundException extends Exception {
    MarksOutOfBoundException(String message) {
        super(message);
    }
}

public class Student {

    int rollNo;
    int marks;

   
    void accept() throws MarksOutOfBoundException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();

        System.out.print("Enter Marks: ");
        marks = sc.nextInt();

        
        if (marks < 0 || marks > 100) {
            throw new MarksOutOfBoundException(
                "Invalid Marks! Marks should be between 0 and 100."
            );
        }

        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {

        Student s = new Student();

        try {
            s.accept();
        } catch (MarksOutOfBoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}