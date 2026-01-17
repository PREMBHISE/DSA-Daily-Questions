import java.util.Scanner;
public class DayFindOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number for a Day: ");
        int day = sc.nextInt();

        switch(day) {
            case 1: 
            System.out.println("Today is a Monday");
            break;
            case 2: 
            System.out.println("Today is a Tuesday");
            break;
            case 3: 
            System.out.println("Today is a Wednesday");
            break;
            case 4: 
            System.out.println("Today is a Thursday");
            break;
            case 5: 
            System.out.println("Today is a Friday");
            break;
            case 6: 
            System.out.println("Today is a Saturday");
            break;
            case 7: 
            System.out.println("Today is a Sunday");
            break;

            default:
                System.out.println("Invalid day");
        }
        sc.close();
    }
}