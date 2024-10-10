import java.util.Scanner;
public class MySeventhApp {
    public static void main(String[] args) {
        int armut, elma, domates, muz, patlican;
        double perArmut = 2.14,perElma = 3.67, perDomates = 1.11, perMuz = 0.95, perPatlican = 5.00, toplam;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kac Kilo ? : ");
        armut = input.nextInt();

        System.out.print("Elma Kac Kilo ? : ");
        elma = input.nextInt();

        System.out.print("Domates Kac Kilo ? : ");
        domates = input.nextInt();

        System.out.print("Muz Kac Kilo ? : ");
        muz = input.nextInt();

        System.out.print("Patlican Kac Kilo ? : ");
        patlican = input.nextInt();

        toplam = (armut * perArmut) + (elma * perElma) + (domates * perDomates) + (muz * perMuz) + (patlican * perPatlican);
        System.out.print("Toplam Tutar : " + toplam + " TL");
    }
}
