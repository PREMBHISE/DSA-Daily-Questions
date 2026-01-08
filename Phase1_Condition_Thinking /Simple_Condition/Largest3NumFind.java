import java.util.Scanner;
public class Largest3NumFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int a = sc.nextInt();

        System.out.print("Enter b Number: ");
        int b = sc.nextInt();

        System.out.print("Enter c Number: ");
        int c = sc.nextInt();

        if(a >= b && a>= c) {
            System.out.println("a is a largets number");
        } else if (b>= a && b>= c) {
            System.out.println("b is a largest number");
        } else {
            System.out.println("c is a largest number");
        }
    }
}