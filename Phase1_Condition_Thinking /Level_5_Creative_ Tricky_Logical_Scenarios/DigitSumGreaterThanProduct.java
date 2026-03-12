import java.util.Scanner;
public class DigitSumGreaterThanProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any integer between 1-9999: ");
        int num = sc.nextInt();

        if (num < 1 || num > 9999) {
            System.out.println("Invalid Number");
        } 
        else {
            int digit;
            int sum = 0;
            int product = 1;
            int temp = num;   // original number safe rakhne ke liye

            while (temp > 0) {
                digit = temp % 10;
                sum += digit;
                product *= digit;
                temp = temp / 10;
            }

            if (sum > product) {
                System.out.println("Condition is Satisfied");
            } else {
                System.out.println("Condition is not Satisfied");
            }
        }

        sc.close();
    }
}