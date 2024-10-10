import java.util.Scanner;
public class MyThirdApp {
    public static void main(String[] args){
        int a, b;
        double c;

        Scanner input = new Scanner(System.in);

        System.out.print("a giriniz: ");
        a = input.nextInt();

        System.out.print("b giriniz: ");
        b = input.nextInt();

        System.out.print("c giriniz: ");
        c = input.nextDouble();


        double u = (a + b + c) / 2 ;
        double AlanAlan = u * (u - a) * (u - b) * (u - c);
        double Alan = Math.sqrt(AlanAlan);

        System.out.println("Alan = " + Alan);

    }
}
