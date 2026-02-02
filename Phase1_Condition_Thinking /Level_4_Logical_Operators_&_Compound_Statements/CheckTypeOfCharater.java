 //Take a character and check if it is a letter, a digit, or neither
import java.util.Scanner;
 public class CheckTypeOfCharater{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Character: ");
        char num = sc.next().charAt(0);

        if(num >= 'a' && num <= 'z' || num >= 'A' && num <= 'Z' ) {
            System.out.println("This Character is a Letter");
        } else if (num >= '0' && num <= '9') {
            System.out.println("This character is a Digit");
        } else {
            System.out.println("This Charater Neither Letter nor Digit");
        }
        sc.close();
    }
} 