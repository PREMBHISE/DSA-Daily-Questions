import java.util.Scanner;
public class DigitSumEqaulMiddle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Three Digit Number: ");
        int num = sc.nextInt();

        int last = num % 10;
        int first = num / 100;
        int middle = (num/10) % 10;

        if(num <= 100 || num >= 999){
            System.out.println("Invalid Number");
        } else if(first + last == middle) {
            System.out.println("Condition is Satisfied");
        } else {
            System.out.println("Condition is not Satisfied");
        }
        sc.close();

    }
}