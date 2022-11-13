import java.util.Scanner;

class CalculateFactorial {

    // By Recrusion
    public static long method1(long input, long factorial) {

        if (input == 1) {
            return Math.abs(factorial);
        }

        factorial *= input;
        return method1(input - 1, factorial);
    }

    // By Loop
    public static long method2(long input) {
        long factorial = 1;
        for (long i = input; i > 1; i--) {
            factorial *= i;
        }
        return Math.abs(factorial);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate it's factorial: ");
        long input = sc.nextLong();

        System.out.println("Calculated factorial by method 1: " + method1(input, 1));
        System.out.println("Calculated factorial by method 2: " + method2(input));

    }
}