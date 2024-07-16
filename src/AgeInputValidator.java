import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeInputValidator {
    private Scanner scanner;
    public AgeInputValidator(Scanner scaneer){
        this.scanner=scanner;
    }
    public int getValidAge(){
        int age=0;
        boolean isValid=false;
        while (!isValid){
            System.out.println("Enter your age between 1 and 120 :");
            try{
                age=scanner.nextInt();
                if(age>=1 && age<=120){
                    isValid=true;
                }
                else{
                    System.out.println("Age not matched");
                }
            }
            catch (InputMismatchException e){
                System.out.println("Invalid input");
                scanner.next();
            }
        }
        return age;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        AgeInputValidator validator=new AgeInputValidator(scanner);
        int age=validator.getValidAge();
        System.out.println("Valid age entered:"+age);
        scanner.close();
    }
}
