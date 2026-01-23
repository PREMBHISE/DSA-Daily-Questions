import java.util.Scanner;
public class DigitFindOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        int value = Math.abs(num);

        if(value < 10){
            System.out.println("Number is a single digit");
        } else if(value < 100){
            System.out.println("Number is a Two Digit");
        } else {
            System.out.println("Number is a multi digit");
        }
        sc.close();
    }
}