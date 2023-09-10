import java.util.*;
public class PositiveOrNot {
    public static void main(String arg[]){
        int a;
        System.out.println("Enter the value of a:- ");
        Scanner sc=new Scanner(System.in);
        a = sc.nextInt();
        if (a>0)
            System.out.println("Positive Number.");
        else
            System.out.println("Negative Number.");
    }
}