import java.util.Scanner;
public class AlphabetRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Alphabet: ");
        char alpha = sc.next().charAt(0);


        if ((alpha >= 'a' && alpha <='z') || (alpha >= 'A' && alpha <= 'Z')) {

            if((alpha >= 'a' && alpha <= 'm') || (alpha >= 'A' && alpha <='M')) {
                System.out.println("alphabet is lies between a to m");
            } else {
                System.out.println("alphabet is lies between n to z");
            }
        } else {
            System.out.println("Invalid input (not an alphabet)");
        }
        sc.close();
    }
}