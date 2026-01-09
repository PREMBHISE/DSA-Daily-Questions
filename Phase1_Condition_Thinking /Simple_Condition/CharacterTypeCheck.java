import java.util.Scanner;
public class CharacterTypeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);

        if(ch>='A' && ch<='Z'){
            System.out.println("Uppercase Letter");
        } else if(ch>='a' && ch<='z') {
            System.out.println("Lowercase Letter");
        } else if (ch>= '0' && ch<='0') {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }


    }
}