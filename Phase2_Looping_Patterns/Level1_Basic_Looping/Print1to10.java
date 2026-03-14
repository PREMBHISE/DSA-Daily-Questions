import java.util.Scanner;

public class Print1to10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = 10;
        for(int i=1; i<=n; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}