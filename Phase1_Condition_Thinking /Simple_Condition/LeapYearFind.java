import java.util.Scanner;
public class LeapYearFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Year: ");
        int year = sc.nextInt();

        if((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0)) {
            System.out.println("This year is a Leap Year");
        } else {
            System.out.println("This year is not a Leap Year");
        }
        
    }
}