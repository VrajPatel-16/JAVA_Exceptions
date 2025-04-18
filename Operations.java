// Operations.java
// This class defines the actual logic for calculator operations

public class Operations {

    // Method to add two numbers
    public double add(Double a, Double b) {
        if (a > 1e6 || b > 1e6) {
            throw new IllegalArgumentException("Numbers too large for addition.");
        }
        return a + b;
    }

    // Method to subtract two numbers
    public double subtract(Double a, Double b) {
        if (a > 1e6 || b > 1e6) {
            throw new IllegalArgumentException("Numbers too large for subtraction.");
        }
        return a - b;
    }

    // Method to multiply two numbers
    public double multiply(Double a, Double b) {
        if (a > 1e6 || b > 1e6) {
            throw new IllegalArgumentException("Numbers too large for multiplication.");
        }
        return a * b;
    }

    // Method to divide two numbers with zero check
    public double divide(Double a, Double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        if (a > 1e6 || b > 1e6) {
            throw new IllegalArgumentException("Numbers too large for division.");
        }
        return a / b;
    }

    // Method to return square of a number
    public double square(Double a) {
        return a * a;
    }

    // Method to return cube of a number
    public double cube(Double a) {
        return a * a * a;
    }

    // Method to return square root of a number
    public double squareRoot(Double a) {
        if (a < 0) {
            throw new ArithmeticException("Cannot compute square root of a negative number.");
        }
        return Math.sqrt(a);
    }
}
