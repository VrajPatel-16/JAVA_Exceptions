# Java Calculator Application

##  Project Overview

This is a simple **Java Calculator** application that performs basic arithmetic operations (addition, subtraction, multiplication, division) as well as advanced operations like square, cube, and square root. The application is structured into two primary files: `Main.java` and `Operations.java`. 

### Key Features:
- **Addition**
- **Subtraction**
- **Multiplication**
- **Division**
- **Square**
- **Cube**
- **Square Root**

The program is designed to handle various exceptions effectively, ensuring smooth user interaction and preventing crashes due to invalid inputs or mathematical errors.

---

##  File Structure

### 1. **Main.java**
   - **Purpose:** Entry point for the program, interacting with the user, and displaying the menu of operations.
   - Handles user input for menu choices and numbers.
   - Uses the methods from `Operations.java` to perform the calculations.
   - Displays the result of the selected operation or error messages.
   - Includes input validation for numeric values and handles different exceptions.

### 2. **Operations.java**
   - **Purpose:** Contains methods for performing the arithmetic operations and advanced calculations.
   - **Methods:**
     - `add(Double a, Double b)`
     - `subtract(Double a, Double b)`
     - `multiply(Double a, Double b)`
     - `divide(Double a, Double b)`
     - `square(Double a)`
     - `cube(Double a)`
     - `squareRoot(Double a)`
   - Handles validation and exception management for each operation.

---

##  Features & Functionalities

### Arithmetic Operations:
- **Addition**: Adds two numbers.
- **Subtraction**: Subtracts the second number from the first number.
- **Multiplication**: Multiplies two numbers.
- **Division**: Divides the first number by the second. Handles divide-by-zero errors.

### Advanced Operations:
- **Square**: Calculates the square of a given number.
- **Cube**: Calculates the cube of a given number.
- **Square Root**: Calculates the square root of a number. Prevents square root calculation of negative numbers.

---

##  Exception Handling

### Handled Exceptions:

| Exception                  | Where It Occurs                                      | Description                                                 |
| -------------------------- | --------------------------------------------------- | ----------------------------------------------------------- |
| `NumberFormatException`     | When non-numeric input is given for menu or numbers | Ensures users input only numeric data                       |
| `InputMismatchException`    | When parsing invalid or empty number values         | Prevents crash on invalid number input                      |
| `IllegalArgumentException`  | For invalid menu choices or extremely large values  | Custom validation to ensure safe inputs                     |
| `ArithmeticException`       | During operations like divide by zero or square root of negative | Prevents runtime math errors                                  |
| `Exception`                 | Catch-all for any other unexpected issue            | Ensures graceful handling of unknown bugs                    |

---



