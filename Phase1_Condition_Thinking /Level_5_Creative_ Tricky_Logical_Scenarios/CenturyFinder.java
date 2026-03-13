import java.util.Scanner;
public class CenturyFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Year: ");
        int year = sc.nextInt();

         if (year <= 0) {
            System.out.println("Invalid year");
        } 
        else {
            int century = (year - 1) / 100 + 1;
            System.out.println("This is the " + century + "th century");
        }

        sc.close();
    }
}

   