import java.util.Scanner;

public class ArrayAccess {

    private int[] numbers;


    public ArrayAccess() {
        this.numbers = new int[]{10, 20, 30, 40, 50}; // Example values
    }

    public void accessElement() {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter an index to access the array element: ");
                int index = scanner.nextInt();

                System.out.println("Element at index " + index + ": " + numbers[index]);
                validInput = true;

            }
            catch (ArrayIndexOutOfBoundsException e) {

                System.out.println("Error: Index out of bounds. Please enter a valid index.");
            }
            catch (Exception e) {

                System.out.println("Error: Invalid input. Please enter a valid integer index.");
                scanner.next();
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        ArrayAccess arrayAccess = new ArrayAccess();
        arrayAccess.accessElement();
    }
}