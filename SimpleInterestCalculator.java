import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=========================================");
        System.out.println("Welcome to the Simple Interest Calculator");
        System.out.println("=========================================");
        
        while (true) {
            // Get the principal amount from the user
            System.out.print("\nEnter the principal amount (or type 'exit' to quit): ");
            String principalInput = scanner.nextLine();

            // Allow the user to exit the program
            if (principalInput.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for using the Simple Interest Calculator. Goodbye!");
                break;
            }

            // Try to convert the input to a double
            double principal;
            try {
                principal = Double.parseDouble(principalInput);
                if (principal <= 0) {
                    System.out.println("Error: Principal amount must be greater than zero.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input for principal amount.");
                continue;
            }


            // Get the rate of interest from the user
            System.out.print("Enter the rate of interest (in %): ");
            double rate;
            try {
                rate = Double.parseDouble(scanner.nextLine());
                if (rate <= 0) {
                    System.out.println("Error: Interest rate must be greater than zero.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input for rate of interest.");
                continue;
            }

            // Get the time period from the user
            System.out.print("Enter the time period (in years): ");
            double time;
            try {
                time = Double.parseDouble(scanner.nextLine());
                if (time <= 0) {
                    System.out.println("Error: Time period must be greater than zero.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input for time period.");
                continue;
            }


            // Calculate simple interest
            double simpleInterest = (principal * rate * time) / 100;

            // Display the result with proper formatting
            System.out.printf("\nThe Simple Interest is: %.2f\n", simpleInterest);
            System.out.println("=========================================");
        }

        
        
        // Close the scanner
        scanner.close();
    }
}
