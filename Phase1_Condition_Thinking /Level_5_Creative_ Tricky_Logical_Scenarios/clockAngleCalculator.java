import java.util.Scanner;

public class clockAngleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int hrs = sc.nextInt();

        System.out.print("Enter minutes: ");
        int min = sc.nextInt();

        // Validation
        if (hrs < 0 || hrs > 23 || min < 0 || min > 59) {
            System.out.println("Invalid time");
        } else {

            // Convert to 12-hour format
            hrs = hrs % 12;

            // Hour hand angle
            double hourAngle = (hrs * 30) + (min * 0.5);

            // Minute hand angle
            double minuteAngle = 6 * min;

            // Absolute difference
            double angle = Math.abs(hourAngle - minuteAngle);

            // Smaller angle
            if (angle > 180) {
                angle = 360 - angle;
            }

            System.out.println("Smaller angle between hands = " + angle + " degrees");
        }

        sc.close();
    }
}