import java.util.Scanner;
public class MultipleOfSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        int value = Math.abs(num);
        int d1 = num % 10; //last digit

        if(value%7==0 || d1 == 7) {
            System.out.println("Number is multiple of 7 or ends with 7");
        } else {
            System.out.println("Number is neither multiple of 7 or ends with 7");
        }
        sc.close();
    }
}