import java.util.*;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a, b, div;
        String k;

        System.out.println("Enter the value of a:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Write 'start' on your keyboard to start the program: ");
        k = sc.nextLine();

        if (k.equalsIgnoreCase("start")) {
            try {
                div = a / b;
                System.out.println("Program executed: Result = " + div);
            } catch (ArithmeticException divisionError) {
                System.out.println("Error! Something went wrong: " + divisionError.getMessage());
            } finally {
                System.out.println("This is the final block of code.");
            }
        } else {
            System.out.println("Program not started. Invalid input.");
        }
    }
}
