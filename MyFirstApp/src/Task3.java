import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        inchToMeter();
    }

    public static void inchToMeter(){
        Scanner input = new Scanner(System.in);
        double inch, meter;
        System.out.print("Input a value for inch: ");
        inch = input.nextDouble();
        meter = inch * 0.0254;
        System.out.println(inch + " inch is " + meter + " meters " );
    }
}
