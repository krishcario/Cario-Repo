import java.util.Scanner;

public class palindrome {

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string you want to check: ");
        String input = scanner.nextLine();
        String inputLower = input.toLowerCase();

        int start = 0;
        int end = input.length() - 1;
        boolean isPalindrome = true;

        while(start < end) {
            if(inputLower.charAt(start) != inputLower.charAt(end)) { //if the letter at start is not equal to letter at end
                isPalindrome = false;
                break; //breaks the loop
            }

            start++;
            end--;
        }
        if(isPalindrome) {
            System.out.println("Your string " + input + " is a palindrome!");
        } else {
            System.out.println("Your string " + input + " is not a palindrome.");
        }
    }
}
