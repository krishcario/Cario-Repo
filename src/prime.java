import java.util.ArrayList;
import java.util.List;

public class prime {

    public static void main (String [] args) {
        List<Integer> primeNumbers = new ArrayList<>();

        for(int numCheck = 2; numCheck <= 100; numCheck++) {
            boolean isPrime = true;

            for (int factor = 2; factor <= numCheck/2; factor++) {
                if(numCheck % factor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                primeNumbers.add(numCheck);
            }
        }
        System.out.println("The prime numbers 1 through 100 are: ");
        for(int number : primeNumbers) {
            System.out.println(number);
        }
    }
}
