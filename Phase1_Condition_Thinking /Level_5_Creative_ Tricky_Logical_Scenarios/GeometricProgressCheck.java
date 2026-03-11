import java.util.Scanner;
public class GeometricProgressCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter a second Number: ");
        int b = sc.nextInt();

        System.out.print("Enter a Third Number: ");
        int c = sc.nextInt();

        if(b * b == a * c ){
            System.out.println("Number are in Geometric Progress ");
        }else {
            System.out.println("Number are Not in Geometric Progress");
        }
        sc.close();
    }
}