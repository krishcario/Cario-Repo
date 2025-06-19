import java.util.Scanner;

public class recursionFactorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What factorial do you want to find? ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("The factorial of " + num + " is " + factorial(num));
        }
    }

    private static int factorial(int num) {
        if (num == 0 || num == 1) return 1;
        return num * factorial(num - 1);
    }
}
