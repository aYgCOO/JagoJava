import java.util.*;
public class Switchcalculoter {
    public static void main(String arg[]){
        int calculator, value,  value_a, value_b;
        System.out.println("1 Addition.");
        System.out.println("2.Subtraction.");
        System.out.println("3.Multiplication.");
        System.out.println("4.Division.");
        System.out.println("5. Modules");

        System.out.println("Enter your choice:- ");
        Scanner s=new Scanner(System.in);
        calculator = s.nextInt();

        System.out.println("Enter the value of  value_a & value_b:- ");
        Scanner sc=new Scanner(System.in);
        value_a = sc.nextInt();
        value_b = sc.nextInt();
        switch (calculator){
            case 1:
                value = value_a + value_b;
                System.out.println("The sum is:" + value);
                break;
            case 2:
                value = value_a - value_b;
                System.out.println("The Subtraction is:"+ value);
                break;
            case 3:
                value = value_a  * value_b;
                System.out.println("The multiplication is:" + value);
                break;
            case 4:
                value = value_a / value_b;
                System.out.println("The division is:" + value);
                break;
            case 5:
                value = value_a % value_b;
                System.out.println("The Modules is:"+value);
                break;
            default:
                System.out.println("Please enter a predefine choice. ");



        }

    }
}
