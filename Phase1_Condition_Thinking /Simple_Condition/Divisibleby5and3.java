import java.util.Scanner;

public class Divisibleby5and3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        if(num % 5 == 0 && num % 3 == 0){
            System.out.println("Number is divisible by both 3 and 5");
        } else {
            System.out.println("Number is not divisible by 3 and 5");
        }
        
    }
}