

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create Scanner for reading user input from console
        Scanner scanner = new Scanner(System.in);

        // Create an object of the Operations class to perform operations
        Operations op = new Operations();

        boolean exit = false;

        System.out.println("===== Welcome to Java Calculator =====");

        // Loop until the user chooses to exit
        while (!exit) {
            // Display the menu of operations to the user
            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square");
            System.out.println("6. Cube");
            System.out.println("7. Square Root");
            System.out.println("8. Exit");
            System.out.print("Enter your choice (1-8): ");

            int choice;

            try {
                // Take input as string and convert to integer
                String choiceInput = scanner.next();
                choice = Integer.parseInt(choiceInput);

                // Check if user input is a valid option
                if (choice < 1 || choice > 8) {
                    throw new IllegalArgumentException("Please choose a valid option (1 to 8).");
                }

                // Declare variables to store input numbers
                Double a = null, b = null;

                // For binary operations (need two numbers)
                if (choice >= 1 && choice <= 4) {
                    System.out.print("Enter first number: ");
                    a = parseInput(scanner.next());

                    System.out.print("Enter second number: ");
                    b = parseInput(scanner.next());
                }
                // For unary operations (need one number)
                else if (choice >= 5 && choice <= 7) {
                    System.out.print("Enter number: ");
                    a = parseInput(scanner.next());
                }

                try {
                    // Variable to hold the result of the operation
                    double result = 0;

                    // Perform operation based on user choice
                    switch (choice) {
                        case 1:
                            result = op.add(a, b);
                            break;
                        case 2:
                            result = op.subtract(a, b);
                            break;
                        case 3:
                            result = op.multiply(a, b);
                            break;
                        case 4:
                            result = op.divide(a, b);
                            break;
                        case 5:
                            result = op.square(a);
                            break;
                        case 6:
                            result = op.cube(a);
                            break;
                        case 7:
                            result = op.squareRoot(a);
                            break;
                        case 8:
                            exit = true;
                            System.out.println("Exiting the calculator. Goodbye!");
                            continue;
                    }

                    // Print the final result to the user
                    System.out.println("Result: " + result);

                } catch (ArithmeticException | IllegalArgumentException e) {
                    // Handle known exceptions like divide by zero or invalid input
                    System.out.println("Error: " + e.getMessage());
                } catch (Exception e) {
                    // Catch any unexpected runtime errors
                    System.out.println("Unexpected Error: " + e.getMessage());
                } finally {
                    // Indicate the end of an operation
                    System.out.println("--- Operation Completed ---");
                }

            } catch (NumberFormatException e) {
                // Handle case where menu input is not a number
                System.out.println("Invalid input. Please enter a number between 1 and 8.");
                scanner.nextLine(); // clear buffer
            } catch (InputMismatchException e) {
                // Handle invalid number inputs
                System.out.println("Invalid input. Please enter numeric values only.");
                scanner.nextLine(); // clear buffer
            } catch (IllegalArgumentException e) {
                // Handle user-defined exceptions (invalid range, etc.)
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                // Catch-all for unexpected exceptions
                System.out.println("Unexpected Error in main: " + e.getMessage());
            }
        }

        // Close the Scanner to prevent resource leak
        scanner.close();
    }

    // Utility method to safely parse input and handle errors
    private static Double parseInput(String input) {
        if (input == null || input.isBlank()) {
            throw new InputMismatchException("Input cannot be empty.");
        }

        try {
            Double value = Double.parseDouble(input);
            if (value.isNaN()) {
                throw new InputMismatchException("Input is not a valid number.");
            }
            return value;
        } catch (NumberFormatException e) {
            throw new InputMismatchException("Invalid number format.");
        }
    }
}
