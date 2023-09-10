import java.util.*;
public class EvenOrOdd {

    public static void main(String arg[]){
        int a;
        System.out.println("Enter the value of a:- ");
        Scanner sc=new Scanner(System.in);
        a = sc.nextInt();
        if (a%2 == 0)
            System.out.println("Even number.");
        else
            System.out.println("Odd number.");
    }
}