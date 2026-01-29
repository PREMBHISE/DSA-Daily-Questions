import java.util.Scanner;
public class CheckPerfectSqure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();


        if(num<0) {
            System.out.println("Not a perfect Square");
        } else {
            boolean isCheckPerfectSqure = false;

            for(int i = 0; i*i <= num; i++) {
                if(i * i == num) {
                    isCheckPerfectSqure = true;
                    break;
                }
            }

            if (isCheckPerfectSqure) {
                System.out.println("Perfect square");
            } else {
                System.out.println("Not a perfect square");
            }

        }

        sc.close();

    }
}