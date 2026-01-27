import java.util.Scanner;
public class CoordinateFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a X coordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter a Y coordinate: ");
        int y = sc.nextInt();

        if(x>0 && y>0) {
            System.out.println("Point lies in first quadrant");
        } else if (x<0 && y>0) {
            System.out.println("Point lies in second quadrant");
        } else if (x<0 && y< 0) {
            System.out.println("Point lies in third quadrant");
        } else if (x>0 && y<0) {
            System.out.println("Point lies in fourth quadrant");
        } else if (x==0 && y==0) {
            System.out.println("Point lies on origin");
        } else {
            System.out.println("Point lies on Axis");
        }
        sc.close();
    }
}