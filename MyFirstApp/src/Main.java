
public class Main {
    public static void main(String[] args) {
//        int num = opposite(235);
//        System.out.println(num);

        int[] arr = {1, 2, 2};
        System.out.println(squareSum(arr));
    }


    public static int opposite(int number) {
        return -number;
    }

    public static String evenOrOdd(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }

    public class BasicOperations {
        public static Integer basicMath(String op, int v1, int v2) {
            switch (op) {
                case "+":
                    return v1 + v2;
                case "-":
                    return v1 - v2;
                case "*":
                    return v1 * v2;
                case "/":
                    return v1 / v2;
                default:
                    throw new IllegalArgumentException("Yanlış əməliyyat simvolu: " + op);
            }
        }
    }

    public static String abbrevName(String name) {

        String[] words = name.split(" ");
        return words[0].substring(0, 1).toUpperCase() + "." + words[1].substring(0, 1).toUpperCase();
    }

    public static int squareSum(int[] n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i] * n[i];
        }
        return sum;
    }



}