import java.util.Scanner;

public class MiddleDigitValue {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 3 digit Number: ");
        int num = sc.nextInt();

        int d1 = num % 10; //last letter
        int d2 = num / 100; // first letter
        int d3 = (num/10) % 10; //second letter

        if(num> 99 && num < 999) {
            if(d3 > d1 && d3 > d2){
                System.out.println("Middle digit is greater than both");
            } else if (d3 < d1 && d3 < d2) {
                System.out.println("Middle digit is smaller than both");
            } else {
                System.out.println("Middle digit is neigther Larger or Smaller");
            }
        }else {
            System.out.println("Invalid Number");
        }
        sc.close();
    }
}