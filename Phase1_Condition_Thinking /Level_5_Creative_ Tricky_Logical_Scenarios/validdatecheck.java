import java.util.Scanner;


public class validdatecheck{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Month Number: ");
        int month = sc.nextInt();

        System.out.print("Enter a Days Number: ");
        int days = sc.nextInt();

        boolean valid = false;

        if(month >= 1 || days <= 12) {
            
            if(month == 2) {
                if (days >= 1 && days <= 28) {
                    valid = true;
                }

            }

            else if(month == 4 || month == 6 || month == 9 || month == 11) {
                if (days >= 1 && days <= 30) {
                    valid = true;
                }
            }
            else {
                if (days >= 1 && days <= 31) {
                    valid = true;
                }
            }

        } 

        if(valid) {
            System.out.println("Valid Date");
        } else {
            System.out.println("Invalid Date");
        }

        sc.close();
    }
}