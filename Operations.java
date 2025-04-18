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