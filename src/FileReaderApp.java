import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class FileReaderApp {
    private Scanner scanner;

    public FileReaderApp (Scanner scanner){
        this.scanner=scanner;
    }

    public void readFile(String filepath) {
        while (true) {
            try {
                File file = new File(filepath);
                Scanner fileScanner = new Scanner(file);

                System.out.println("File contents:");
                while (fileScanner.hasNextLine()) {
                    System.out.println(fileScanner.nextLine());
                }

                fileScanner.close();
            }
            catch (FileNotFoundException e) {
                System.out.println("File not found:" + filepath);
                filepath = scanner.next();
            }
            catch (IOException e){
                System.out.println("Error reading file:"+filepath);
                System.out.println("Please enter another file path:");
                filepath=scanner.next();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        FileReaderApp fileReader =new FileReaderApp(scanner);
        System.out.println("Testing FileReaderApp");
        System.out.println("Enter a valid file path:");
        String filepath1=scanner.next();
        fileReader.readFile(filepath1);
        System.out.println("Enter a non-existent file path");
        String filepath2 =scanner.next();
        fileReader.readFile(filepath2);
        System.out.println("Enter a file path with restricted permissions:");
        String filepath3=scanner.next();
        fileReader.readFile(filepath3);

        scanner.close();
    }
}
