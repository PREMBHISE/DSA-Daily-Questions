import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        num = Math.abs(num);

        int count = 0;

        if(num == 0) {
                count = 1;
            }

        while(num>0) {
            
            num = num/10;
            count = count + 1;

        }
        System.out.println("Total Digits Count= " + count);

        sc.close();
    }
}