import java.util.Scanner;

public class DateCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Month1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter a Date1: ");
        int d1 = sc.nextInt();

        System.out.print("Enter a Month2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter a Date2: ");
        int d2 = sc.nextInt();

        if ((m1 < 1 || m1 > 12) || (m2 < 1 || m2 > 12)) {
            System.out.println("Invalid month");
        }

        else if(m1 < m2) {
            System.out.println("Date1 Come First");
        }

        else if(m2 < m1) {
            System.out.println("Date2 Come First");
        }
        
        else {
            if(d1 < d2) {
                System.out.println("Date1 come First");
            } else if(d1 > d2) {
                System.out.println("Date2 come First");
            } else {
                System.out.println("Both dates are same");
            }
        }

        sc.close();
         
        

    }

}