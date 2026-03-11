import java.util.Scanner;
public class CheckArithmaticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter a Second Number: ");
        int b = sc.nextInt();

        System.out.print("Enter a Third Number: ");
        int c = sc.nextInt();

        int smallest, middle, largest;

        if(a >= b && a >= c) {
            largest = a;
            if(b >= c) {
                middle = b;
                smallest = c;
            } else {
                middle = c;
                smallest = b;
            } 

        }
        else if (b >= a && b >= c) {
            largest = b;
            if(a >= c) {
                middle = a;
                smallest = c;
            } else {
                middle = c;
                smallest = a;
            }


        }
        else {
            largest = c;
            if (a >= b) {
                middle = a;
                smallest = b;
            } else {
                middle = b;
                smallest = a;
            }
        }

        if ((middle - smallest) == (largest - middle)) {
            System.out.println("Numbers are in Arithmetic Progression");
        } else {
            System.out.println("Numbers are NOT in Arithmetic Progression");
        }
        sc.close();
    }
}