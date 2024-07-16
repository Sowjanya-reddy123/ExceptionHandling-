import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionCalculator {
        private void performDivision() {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                try {
                    System.out.print("Enter the first integer: ");
                    int numerator = scanner.nextInt();

                    System.out.print("Enter the second integer: ");
                    int denominator = scanner.nextInt();

                    try {
                        int result = numerator / denominator;
                        System.out.println("The result of the division is: " + result);
                        break;
                    }
                    catch (ArithmeticException e) {
                        System.out.println("Error: Division by zero is not allowed. Please enter a valid denominator.");
                    }
                }
                catch (InputMismatchException e) {
                    System.out.println("Error: Invalid input. Please enter valid integers.");
                    scanner.next();
                }
            }
            scanner.close();
        }

        public static void main(String[] args) {
            DivisionCalculator calculator = new DivisionCalculator();
            calculator.performDivision();
        }

}
