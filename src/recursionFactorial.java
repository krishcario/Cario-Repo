import java.util.Scanner;

public class recursionFactorial {

    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What factorial do you want to find?");
        int num = scanner.nextInt();

        System.out.println("The factorial if " + num + " is " + factorial(num));
    }

    private static int factorial(int num) {
        if(num == 1) {
            return 1; //1 factorial is 1
        } else {
            return num * factorial(num-1); //calls the method in itself to loop it
        }
    }
}
