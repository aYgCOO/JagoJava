import java.util.*;
class Q1_Calculater {
    public static void main(String arg[]){
        int num1 , num2;
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the first value:");
        num1 = n.nextInt();
        System.out.println("Enter the second value:");
        num2 = n.nextInt();


        while (true){
            System.out.println("Choose a option: \n => + .Addition \n => - .Subtraction \n => *.Multiplication \n => / .Division \n => %.Modules \n => e .Ext:");
            Scanner ch = new Scanner(System.in);
            String choice = ch.next();
            if(choice.charAt(0) == '+'){
                int add = num1 + num2;
                System.out.println("Addition = " + add);



            } else if (choice.charAt(0) == '-') {
                int sub = num1 - num2;
                System.out.println("Subtraction = "+ sub);

            }else if (choice.charAt(0) == '*'){
                int mul = num1 * num2;
                System.out.println("Multiplication = "+ mul);
            } else if (choice.charAt(0) == '/') {
                int div = num1 / num2;
                System.out.println("Division = "+ div);

            }else if (choice.charAt(0) == '%') {
                int mod = num1 % num2;
                System.out.println("Modules = " + mod);
            } else if (choice.equals('e')) {
                System.out.println("Exit");
                break;

            }
        else {
                System.out.println("Please choose a valid option.");
            }

        }

    }
}