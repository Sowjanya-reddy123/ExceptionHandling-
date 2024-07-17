import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MultiOperationHandler {


    public void performOperations() {
        try {
            performDivision(20, 0);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }


        int[] numbers = {1, 2, 3, 4, 5};
        try {
            accessArrayElement(numbers, 20);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
        }


        try {
            readFile("NonExistentFile.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
        catch (IOException e) {
            System.out.println("Error: An IO error occurred while reading the file.");
        }
    }


    private void performDivision(int a, int b) {
        int result = a / b;
        System.out.println("Division result: " + result);
    }


    public void accessArrayElement(int[] array, int index) {
        int element = array[index];
        System.out.println("Element at index " + index + ": " + element);
    }


    public void readFile(String fileName) throws IOException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }

        scanner.close();
    }

    public static void main(String[] args) {
        MultiOperationHandler handler = new MultiOperationHandler();
        handler.performOperations();
    }
}