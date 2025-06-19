import java.util.ArrayList;
import java.util.List;

public class prime {
    public static void main(String[] args) {
        List<Integer> primeNumbers = new ArrayList<>();

        for (int numCheck = 2; numCheck <= 100; numCheck++) {
            if (isPrime(numCheck)) {
                primeNumbers.add(numCheck);
            }
        }

        System.out.println("The prime numbers from 1 through 100 are:");
        for (int number : primeNumbers) {
            System.out.println(number);
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
