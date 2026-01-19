import java.util.Scanner;
public class DistinctDigitFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a 3 Digit Number: ");
        int num = sc.nextInt();

        int d1 = num % 10; //last digit
        int d2 = num / 100; //first digit
        int d3 = (num / 10) % 10; //second digit

        // System.out.println(("d1 ="+ d1) + ("d2 ="+ d2) + ("d3 =" + d3)); 

        if(num >= 100 && num<=999) {

            if(d1 != d2 && d2 != d3 && d1 != d3) {
                System.out.println("All digits are distinct");
            } else {
                System.out.println("All digits are not distinct");
            }
        }else {
            System.out.println("This is not a 3 digit number");
        }

        sc.close();
    }
    
}