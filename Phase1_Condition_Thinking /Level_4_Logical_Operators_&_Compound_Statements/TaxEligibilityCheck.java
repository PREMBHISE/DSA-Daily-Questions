// Take income and age, and check if eligible for tax (age > 18 and income > 5 L).

import java.util.Scanner;
public class TaxEligibilityCheck {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Age: ");
        int age = sc.nextInt();

        System.out.print("Enter a Income: ");
        int income = sc.nextInt();

        if(age > 18 && income > 500000) {
            System.out.println("You are eligible for tax");
        } else {
            System.out.println("You are not eligible for tax");
        }
        sc.close();

        
    }
}