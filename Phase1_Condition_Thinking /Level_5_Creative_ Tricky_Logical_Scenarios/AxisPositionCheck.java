import java.util.Scanner;
public class AxisPositionCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a X coordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter a Y coordinate: ");
        int y = sc.nextInt();

        if(x == 0 && y == 0) {
            System.out.println("Point Lies on a Origin");
        } else if(y == 0) {
            System.out.println("Point Lies on a X-axis");
        } else if(x == 0) {
            System.out.println("Point Lies on a Y-axis");
        } else {
            System.out.println("Point have Niether axis");
        }
        sc.close();
    }
}