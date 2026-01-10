import java.util.Scanner;
public class TriangleFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Side 1: ");
        int side1 = sc.nextInt();

        System.out.print("Enter a Side 2: ");
        int side2 = sc.nextInt();

        System.out.print("Enter a Side 3: ");
        int side3 = sc.nextInt();

        if(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1){ 
            System.out.println("This is a Triangle");
        } else {
            System.out.println("This is not a Triangle");
        }

    }
}