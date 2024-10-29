import java.util.Scanner;
public class SumNumber22 {
    public static   Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        numberSum();
    }
    public static void numberSum(){
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int sum = 0;
        while (number>0){
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);

    }
}
