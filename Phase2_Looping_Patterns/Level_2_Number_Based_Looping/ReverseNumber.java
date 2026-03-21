import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number = ");
        int num = sc.nextInt();

        num = Math.abs(num);
        int reverse = 0;
        int digit = 0;


        while(num>0) {
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;

        }
        System.out.println("Reverse = " + reverse);
        sc.close();

    }
}