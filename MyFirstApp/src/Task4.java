import java.util.Scanner;

public class Task4 {
  public static   Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        treeHundredNumberSum();
//        numberSum();
          oppsiteNumber();
    }

    public static void treeHundredNumberSum() {
        int abc, sum = 0, bc, b, a, c;

        System.out.print("Eded daxil edin: ");
        abc = scanner.nextInt();

        if (abc > 0) {
             bc = abc % 100;
             b = bc / 10;
             c = bc % 10;
             a = abc / 100;

            sum = a + b + c;

            System.out.println("Cem: " + sum);
        } else {
            System.out.println("Musbet eded daxil edin");
        }
    }
    public static void numberSum(){
        System.out.println("Enter the number");
        int number=scanner.nextInt();
        int sum = 0;
//        int number2=number/10;
//        System.out.println(number2);
//        while(number>0){
//            double number2=number/10;
//        }
        while (number>0){
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);

    }

    public static void oppsiteNumber(){
        System.out.println("Enter the number");
        int number=scanner.nextInt();
        int n=0;//432
        while(number>0){//234
             n = n * 10 + number % 10;//->234 10 a boldu= 4 , 43,432
             number =number/ 10;//number ->23, 2,0
        }
        System.out.println(n);

    }
    //Salam ->malas  DAxil edilis sozun tersini yazin;
    //OOP-> vasitesile konkulyatot app-ni yazacaqsiz,Iphone ,Samsung,Redmi,Honor;



}
