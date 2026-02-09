import java.util.Scanner;
public class ElectricityBillCalculater  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Unit: ");
        int unit = sc.nextInt();

        int bill = 0;

        if(unit < 0) {
            System.out.println("Invalid Unit");
        } else if(unit <=100) {
            bill = unit * 1;
            System.out.println("Total Bill = " + bill);
        } else if (unit <= 200) {
            bill = ((100  * 1) + ((unit - 100) * 2));
            System.out.println("Total Bill = " + bill);
        } else {
            bill = ((100 * 1) + (100 * 2) + ((unit - 200) * 3));
            System.out.println("Total Bill =" + bill);
        }
        sc.close();


        }
    }
