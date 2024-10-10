import java.util.Scanner;
public class MySixthApp {
    public static void main(String[] args){
        int kg;
        double boy, VucutKitleIndeksi;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kg = input.nextInt();

        VucutKitleIndeksi = kg / (boy * boy);
        System.out.print("Vücut Kitle İndeksiniz: " + VucutKitleIndeksi);
    }
}
