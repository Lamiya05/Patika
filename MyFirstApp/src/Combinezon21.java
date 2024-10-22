import java.util.Scanner;

public class Combinezon21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, r, totalN=1, totalR=1, totalNR=1;
        System.out.print("n = ");
        n = scan.nextInt();

        System.out.print("r = ");
        r = scan.nextInt();

        for (int i=1; i<=n; i++){
            totalN = totalN * i;
        }
        for (int i=1; i<=r; i++) {
            totalR = totalR * i;
        }

        for (int i=1; i<=(n-r); i++) {
            totalNR = totalNR * i;
        }

        double C= totalN / (totalR * totalNR);

        System.out.println("C(n,r) = " + C);

    }
}
