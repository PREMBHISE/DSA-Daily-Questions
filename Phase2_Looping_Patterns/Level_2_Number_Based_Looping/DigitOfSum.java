import java.util.Scanner;
public class DigitOfSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        num = Math.abs(num);

        int sum = 0;
        int digit = 0;

        while(num > 0) {
            digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        
        System.out.println("The sum of digit is =" + sum);
        sc.close();

    }
}