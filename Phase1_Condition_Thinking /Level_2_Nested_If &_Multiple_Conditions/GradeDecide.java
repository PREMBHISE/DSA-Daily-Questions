import java.util.Scanner;
public class GradeDecide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Marks: ");
        int marks = sc.nextInt();

        // if(Marks >= 90 && Marks <= 100) {
        //     System.out.println("Grade A");
        // } else if (Marks >= 75 && Marks <= 89) {
        //     System.out.println("Grade B");
        // }else if (Marks >=  60 && Marks <= 74) {
        //     System.out.println("Grade C");
        // }else if (Marks >= 40 && Marks <= 59) {
        //     System.out.println("Grade D");
        // }else if (Marks < 40 ) {
        //     System.out.println("Fail");
        // } else {
        //     System.out.println("Invalid Marks");
        // }

         if (marks < 0 || marks > 100) {
            System.out.println("Invalid Marks");
        } else if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else if (marks >= 40) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }
    }
}