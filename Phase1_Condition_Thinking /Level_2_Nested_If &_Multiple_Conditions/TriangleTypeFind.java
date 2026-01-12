import java.util.Scanner;

public class TriangleTypeFind {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Side1: ");
        int s1 = sc.nextInt();
        System.out.print("Enter a Side2: ");
        int s2 = sc.nextInt();
        System.out.print("Enter a Side3: ");
        int s3 = sc.nextInt();

        if(s1 + s2 > s3 && s1+ s3 > s2 && s2 + s3 > s1) {
             if ((s1 == s2) && (s2 == s3) && (s3 == s1)) {
                System.out.println("This is an Equilateral Triangle");
            } else if ((s1 == s2) || (s2 == s3) || (s3 == s1) ) {
                System.out.println("This is an Isoscelses Triangle");
            } else  {
                System.out.println("This is a solene Triangle");
            }
        }else {
            System.out.println("This is not a Triangle");
        }
        sc.close();
    }
}