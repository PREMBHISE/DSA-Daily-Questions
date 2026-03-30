import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        num = Math.abs(num);

        int original = num;
        int digit = 0;
        int reverse = 0;

        while(num > 0) {
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if(original == reverse) {
            System.out.println("Number is a Palindrome");
        } else {
            System.out.println("Number is not a Palindrome");
        }

        sc.close();
    }
}