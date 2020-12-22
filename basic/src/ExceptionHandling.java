/*
Java allow you to recover from error by catching Exception (or called "runtime exception").

Main focus
- Using try/catch with base class Exception
- Catching specific subclass exception
- Using try/catch/finally

Further Study:
- Uncheck exception is more friendly to use by caller
- Checked exception is more verbose and explicit
 */
import java.io.*;

public class ExceptionHandling {
    public static void main(String[] args) {
        // Using try catch to handle exception
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println("Something went wrong. Reason: " + e.getMessage());
            System.out.println("Exception class name: " + e.getClass().getName());
//            e.printStackTrace(); // Print this if you want to debug full stacktrace
        }

        // Catch specific subclass exceptions
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(a / b);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by Zero");
        } catch (Exception e) {
            System.out.println("Something went wrong. Reason: " + e.getMessage());
        }

        // Same as above
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(a / b);
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Invalid arguments.");
        } catch (Exception e) {
            System.out.println("Something went wrong. Reason: " + e.getMessage());
        }

        // Finally block
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(a / b);
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Something went wrong. Reason: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using our program!");
        }

        // Bad style:
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(a / b);
        } catch (Exception e) {
            // Do nothing - it's consider by style to swallow exception and do nothing about it.
        }

        // Checked vs Unchecked exceptions
        testDivide();
//        testDivideWithCheckedException(); // ERROR: You must catch it
        testDivideWithUncheckException();

        // Try Resources instead of finally block
        // Reading text file example - old way
        String file = "Hello.java";
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Failed to read file " + file);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Failed to close reader.");
                }
            }
        }

        // Reading text file example - new way
        try (BufferedReader reader2 = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader2.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Failed to read file " + file);
        }

        // Another common method that requires handle error
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            System.out.println("Unable to sleep 1 sec.");
        }
    }

    public static class BadNumberException extends Exception {
        public BadNumberException(String message) {
            super(message);
        }
    }

    public static void testDivide() {
        try {
            divide(4, 2);
        } catch (BadNumberException e) {
            System.out.println(e);
        }
    }

    public static void testDivideWithCheckedException() throws BadNumberException {
        divide(4, 2);
    }

    public static void testDivideWithUncheckException() {
        try {
            divide(4, 2);
        } catch (BadNumberException e) {
            throw new RuntimeException(e);
        }
    }

    public static int divide(int a, int b) throws BadNumberException {
        if (b == 0) {
            throw new BadNumberException("You can't divide by zero.");
        }
        return a / b;
    }

}
