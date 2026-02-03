//Take 24-hour time (hours and minutes) and print whether it is AM or PM.

import java.util.Scanner;
public class TimeAMPMFind {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Hours: ");
        int Hrs = sc.nextInt();

        System.out.print("Enter a Minutes: ");
        int Min = sc.nextInt();

        if(( Hrs < 0 || Hrs >23) || (Min < 0 || Min > 59) ) {
            System.out.println("Invalid time");

        } else if((Hrs >= 0 && Hrs <= 11)) {
            System.out.println("This is a AM");
        } else {
            System.out.println("This is a PM");
        }
        sc.close();
    }
}