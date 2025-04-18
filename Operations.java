// Operations.java

public class Operations {

    // Addition with value check
    public double add(Double a, Double b) {
        if (a > 1e6 || b > 1e6) {
            throw new IllegalArgumentException("One of the numbers is too large for addition.");
        }
        return a + b;
    }

    // Subtraction with value check
    public double subtract(Double a, Double b) {
        if (a > 1e6 || b > 1e6) {
            throw new IllegalArgumentException("One of the numbers is too large for subtraction.");
        }
        return a - b;
    }

    // Multiplication with value check
    public double multiply(Double a, Double b) {
        if (a > 1e6 || b > 1e6) {
            throw new IllegalArgumentException("One of the numbers is too large for multiplication.");
        }
        return a * b;
    }

    // Division with zero and size checks
    public double divide(Double a, Double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        if (a > 1e6 || b > 1e6) {
            throw new IllegalArgumentException("One of the numbers is too large for division.");
        }
        return a / b;
    }

    // Square of a number
    public double square(Double a) {
        return a * a;
    }

    // Cube of a number
    public double cube(Double a) {
        return a * a * a;
    }