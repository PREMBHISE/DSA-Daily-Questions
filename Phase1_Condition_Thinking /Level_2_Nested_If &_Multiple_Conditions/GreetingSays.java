import java.util.Scanner;
public class GreetingSays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Hour: ");
        int hours = sc.nextInt();

         if (hours >= 5 && hours <= 11) {
            System.out.println("Good Morning");
        }  else if (hours >= 12 && hours <= 16) {
            System.out.println("Good Afternoon");
        }  else if (hours >= 17 && hours <= 20) {
            System.out.println("Good Evining");
        }  else if ((hours >= 21 &&  hours <= 23) || (hours >=0 && hours <=4)) {
            System.out.println("Good Night");
        } else {
            System.out.println("Invalid Time");
        }
        sc.close();
    }
}