import java.util.Scanner;
public class MyFifthApp {
    public static void main(String[] args) {
        int  r, a;
        double pi = 3.14, Alan , dilimAlan;
        Scanner input = new Scanner(System.in);

        System.out.print("r giriniz: ");
        r = input.nextInt();

        System.out.print("a derece giriniz: ");
        a = input.nextInt();

        Alan = (pi * r * r);
        dilimAlan = (Alan * a) / 360;
        System.out.print("Dilim alan: " + dilimAlan);
    }
}
