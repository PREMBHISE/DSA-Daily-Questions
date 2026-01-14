import java.util.Scanner;
public class VotingEligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a age: ");
        int age = sc.nextInt();

        if(age < 0){
            System.out.println("Invalid age");
        } else if (age > 18) {
            System.out.println("You are eligible for voting");
        } else {
            System.out.println("You are not eligible for voting");
        }
        sc.close();
    }
}