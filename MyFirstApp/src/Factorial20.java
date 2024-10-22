import java.util.Scanner;

public class Factorial20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int eded = 1;

        System.out.print("n = ");
        int n = scan.nextInt();

        for(int i=1; i<=n; i++) {
            eded = eded * i;
        }
        System.out.println("n! = " + eded);
    }
}
