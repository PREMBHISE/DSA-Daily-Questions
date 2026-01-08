import java.util.Scanner;

public class NumberSign {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Integer: ");
        int Num = sc.nextInt();

        if(Num > 0){
         System.out.println("Number is a positive Integer");
        }else if(Num < 0){
            System.out.println("Number is a Negative Integer");
        } else {
            System.out.println("Number is Zero");
        }
        

        

    }
}