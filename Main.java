

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operations op = new Operations();
        boolean exit = false;

        System.out.println("===== Welcome to Java Calculator =====");

        while (!exit) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
            System.out.println("5. Square\n6. Cube\n7. Square Root\n8. Exit");
            System.out.print("Enter your choice (1-8): ");

            int choice;

            try {
                String choiceInput = scanner.next();
                choice = Integer.parseInt(choiceInput);

                if (choice < 1 || choice > 8) {
                    throw new IllegalArgumentException("Invalid menu choice. Please choose between 1 and 8.");
                }

                Double a = null, b = null;

                if (choice <= 4) {
                    System.out.print("Enter first number: ");
                    a = parseInput(scanner.next());

                    System.out.print("Enter second number: ");
                    b = parseInput(scanner.next());
                } else if (choice <= 7) {
                    System.out.print("Enter number: ");
                    a = parseInput(scanner.next());
                }

                try {
                    double result = 0;

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

                    System.out.println("Result: " + result);

                } catch (ArithmeticException | IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("Unexpected Error: " + e.getMessage());
                } finally {
                    System.out.println("--- Operation Completed ---");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid menu input. Please enter a number between 1 and 8.");
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter numeric values.");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected Error in main: " + e.getMessage());
            }
        }

        scanner.close();
    }

    private static Double parseInput(String input) {
        if (input == null || input.isBlank()) {
            throw new InputMismatchException("Input cannot be empty.");
        }

        try {
            Double value = Double.parseDouble(input);
            if (value.isNaN()) {
                throw new InputMismatchException("Input is NaN (not a number).");
            }
            return value;
        } catch (NumberFormatException e) {
            throw new InputMismatchException("Invalid number format.");
        }
    }
}
