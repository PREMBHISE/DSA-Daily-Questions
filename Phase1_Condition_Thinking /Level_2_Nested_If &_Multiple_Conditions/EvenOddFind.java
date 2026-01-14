import java.util.Scanner;
public class EvenOddFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter a Second Number: ");
        int b = sc.nextInt();

        if(a % 2 == 0 && b % 2 == 0) {
            System.out.println("Both number are the even");
        } else if (a % 2 != 0 && b % 2 !=0) {
            System.out.println("Both number are the odd");
        } else if (a % 2 == 0 && b % 2 !=0) {
            System.out.println("Only First Number is even");
        } else {
            System.out.println("Only Second Number is even");
        }
        sc.close();
    }
} 
