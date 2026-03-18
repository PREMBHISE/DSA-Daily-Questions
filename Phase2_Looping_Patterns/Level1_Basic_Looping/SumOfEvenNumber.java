import java.util.Scanner;
public class SumOfEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i<=n; i++) {
            if(i%2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum Of Even Number is: " + sum);
        sc.close();
    }
}