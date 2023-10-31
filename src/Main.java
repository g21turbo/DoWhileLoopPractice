import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userNumber;

        do {
            System.out.print("Please enter a positive integer: ");
            userNumber = scanner.nextInt();

            if (userNumber <= 0) {
                System.out.println("Invalid input. Please enter a positive integer.");
            }
        } while (userNumber <= 0);

        System.out.println("You entered a valid positive integer: " + userNumber);
    }
}