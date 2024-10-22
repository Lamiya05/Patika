import java.util.Scanner;

public class ExponentialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1, total = 1;
        int n, k;
        System.out.print("n = ");
        n = input.nextInt();

        System.out.print("k = ");
        k = input.nextInt();

        while(i <=k ) {
            total = total * n;
            i++;
        }

        System.out.println("n ustu k = " + total);
    }
}
