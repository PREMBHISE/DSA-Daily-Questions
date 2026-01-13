import java.util.Scanner;
public class MultipleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a == 0 || b == 0) {
            System.out.println("Cannot check multiple with zero");
        } else if (a % b == 0 || b % a == 0) {
            System.out.println("One number is a multiple of the other");
        }else {
            System.out.println(" Neither number is multiple of the other");
        }

        sc.close();
        }
}