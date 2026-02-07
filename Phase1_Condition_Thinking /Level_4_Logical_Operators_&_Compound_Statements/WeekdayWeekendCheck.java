import java.util.Scanner;
public class WeekdayWeekendCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        if(num >=1 && num <= 5) {
            System.out.println("Weekday");
        } else if((num == 6) || (num == 7)) {
            System.out.println("Weekend");

        } else {
            System.out.println("Invalid Number");
        }
        sc.close();

    }
}
