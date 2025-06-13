import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class greetingApp {
    public static void main(String [] args) {
        Scanner scanner = new Scanner (System.in); //reads user input
        System.out.println("Hey! What is your name:  ");

        String name = scanner.nextLine(); //creates a variable for the name to be used later

        System.out.println("Hello " + name + "! " + "It is so nice to meet you.");

        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");

        System.out.println("The current date and time is " + currentDateTime.format(formatter) + ".");
    }
}