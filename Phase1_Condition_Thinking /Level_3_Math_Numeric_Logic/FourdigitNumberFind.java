import java.util.Scanner;
public class FourdigitNumberFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a 4 Digit Number: ");
        int num = sc.nextInt();

        int d1 = num % 10; //last digit
        int d2 = num / 1000; // first digit


        if(num > 999 && num < 10000) {
            if(d1 == d2) {
                System.out.println("First Digit and last digit are same");
            } else {
                System.out.println("First Digit and last digit are not same");
            }
        } else {
            System.out.println("Invalid Number");
        }
        sc.close();
    }
}