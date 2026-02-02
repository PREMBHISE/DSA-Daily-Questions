// Take three numbers and print the median value (neither maximum nor minimum).

import java.util.Scanner;
public class MedianOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int num3 = sc.nextInt();

        if ((num1 > num2 && num1 < num3) || (num1 > num3 && num1 < num2)) {
            System.out.println("1st Number is a Median");
        } else if ((num2 > num1 && num2 < num3) || (num2 > num3 && num2 < num1)) {
            System.out.println("2nd Number is a Median");
        } else if ((num3 > num1 && num3 < num2) || (num3 > num2 && num3 < num1)) {
            System.out.println("3rd Number is a Median");
        } else {
            System.out.println("Median not uniquely defined");
        }
        sc.close();
}
}
