import java.util.Scanner;

public class DivisibleOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Amount: ");
        int amt = sc.nextInt();

        if (amt <= 0) {
            System.out.println("Invalid amount");
        }
        else if (amt % 100 == 0) {
            System.out.println("Amount can be evenly divided into 2000, 500 and 100 notes");
        }
        else {
            System.out.println("Amount cannot be evenly divided into 2000, 500 and 100 notes");
        }
        sc.close();
    }
}