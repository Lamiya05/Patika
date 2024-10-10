import java.util.Scanner;
public class MySecondApp {
    public static void main(String[] args){
        double tutar, kdvOran = 0.18, kdvOran1 = 0.08, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Ucret oranini giriniz: ");
        tutar = input.nextDouble();

        if (tutar < 1000) {
            kdvTutar = tutar * kdvOran;
            System.out.println("Kdv Orani: " + kdvOran);
        }

        else {
            kdvTutar = tutar * kdvOran1;
            System.out.println("Kdv Orani: " + kdvOran1);
        }

        kdvliTutar = tutar + kdvTutar;

        System.out.println("Kdvsiz tutar: " + tutar);
        System.out.println("Kdv tutari: " + kdvTutar);
        System.out.println("Kdvli tutari: " + kdvliTutar);

    }
}