import java.util.Scanner;
public class PositiveSumCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 1st Number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter a 2nd Number: ");
        int n2 = sc.nextInt();

        if ( (n1 > 0) && (n2 > 0) && (n1 + n2) < 100 ) {
            System.out.println("Both numbers are positive and sum is less than 100");
        } else {
            System.out.println("Both numbers are not positive and thier sum is not less than 100");
        }
        sc.close();
    }
}