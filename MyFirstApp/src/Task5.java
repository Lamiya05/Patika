import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        farenheit();
    }

    public static void farenheit(){
        Scanner input = new Scanner(System.in);
        int f;
        double C;
        System.out.print("Input a degree in Fahrenheit: ");
        f = input.nextInt();
        C =(f - 32) * 5 / 9;

        System.out.println(f + " degree Fahrenheit is equal to " + C + " in Celsius.");

    }
}
