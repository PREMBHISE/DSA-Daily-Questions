import java.util.Scanner;

public class TemperatureFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Temperature in celsius :");
        int Temp= sc.nextInt();

        if(Temp > 33) {
            System.out.println("Temperature is a Hot");
        } else if (Temp <= 33 && Temp >=14) {
            System.out.println("Temperature is a Warm");
        }else {
            System.out.println("Temperature is a Cold");
        }
        
        
    }
}