import java.util.Scanner;

public class Task {
    public static void oddEvenNumber(){
        Scanner input = new Scanner(System.in);

        System.out.print("A= ");
        int a = input.nextInt();

        System.out.print("B= ");
        int b = input.nextInt();

        System.out.print("C= ");
        int c = input.nextInt();

        System.out.print("D= ");
        int d = input.nextInt();

        if (a == 0) {
            System.out.println("A ne tekdir ne cut");
        } else if (a % 2 == 0) {
            System.out.println("A cutdur");
        } else {
            System.out.println("A tekdir");
        }

        if (b == 0) {
            System.out.println("B ne tekdir ne cut");
        } else if (b % 2 == 0) {
            System.out.println("B cutdur");
        } else {
            System.out.println("B tekdir");
        }

        if (c == 0) {
            System.out.println("C ne tekdir ne cut");
        } else if (c % 2 == 0) {
            System.out.println("C cutdur");
        } else {
            System.out.println("C tekdir");
        }

        if (d == 0) {
            System.out.println("D ne tekdir ne cut");
        } else if (d % 2 == 0) {
            System.out.println("D cutdur");
        } else {
            System.out.println("D tekdir");
        }
    }

    public static void main(String[] args) {
        oddEvenNumber();
    }
}
