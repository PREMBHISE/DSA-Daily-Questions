import java.util.Scanner;
public class PrintTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Table Number:");
        int n = sc.nextInt();

        for(int i=1; i<=10; i++) {
            // int result = n * i;
            System.out.println(n + "X" + i + "=" +  n*i);
        }
        sc.close();
    }
}