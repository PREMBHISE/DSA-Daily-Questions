import java.util.Scanner;
public class CheckNumberWithin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        if(num >= 100 && num <=999) {
            System.out.println("Number lies within the range 100 to 999");
        } else {
            System.out.println("Number not lies within the range 100 to 999");
        }
        sc.close();
    }
}