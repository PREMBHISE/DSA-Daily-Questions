import java.util.Scanner;

public class PythagoreanTripletCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        // All numbers must be positive
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Invalid input (numbers must be positive)");
        } else {
            int x, y, z; // z will be the largest

            // Find largest number
            if (a >= b && a >= c) {
                z = a;
                x = b;
                y = c;
            } else if (b >= a && b >= c) {
                z = b;
                x = a;
                y = c;
            } else {
                z = c;
                x = a;
                y = b;
            }

            // Pythagorean condition
            if ((x * x) + (y * y) == (z * z)) {
                System.out.println("These numbers form a Pythagorean Triplet");
            } else {
                System.out.println("These numbers do NOT form a Pythagorean Triplet");
            }
        }

        sc.close();
    }
}
