import java.util.Scanner;

public class TriangleAngleFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 1st angle: ");
        int d1 = sc.nextInt();

        System.out.print("Enter a 2nd angle: ");
        int d2 = sc.nextInt();

        int d3 = 180 - (d1 + d2);

        if (d1 <= 0 || d2 <= 0 || d1 + d2 >= 180) {
            System.out.println("Angle is invalid");
        } else {
            System.out.println("Third angle is: " + d3);
        }
        sc.close();
    }
}