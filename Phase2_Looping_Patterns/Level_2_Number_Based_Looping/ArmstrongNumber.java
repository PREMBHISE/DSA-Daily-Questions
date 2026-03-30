import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        num = Math.abs(num);

        int original = num;

        int sum = 0;
        int digit = 0;

        while(num>0) {
            digit = num % 10;
            sum += digit * digit * digit;
            num = num / 10;
        }
        if(original == sum){
            System.out.println("This is a Armstrong Number");
        } else {
            System.out.println("This is not a Armstrong");
        }

        sc.close();
        
    }
}