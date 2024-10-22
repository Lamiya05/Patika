import java.util.Scanner;

public class ExponentialNumberFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i=1, total = 1;
        int n, k;
        System.out.print("n = ");
        n = input.nextInt();

        System.out.print("k = ");
        k = input.nextInt();

        for (i=1; i<=k; i++) {
            total = total*n;
        }
        System.out.println(total);
    }
}
