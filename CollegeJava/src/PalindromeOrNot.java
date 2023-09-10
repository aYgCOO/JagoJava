import java.util.*;
public class PalindromeOrNot {
    public static void main(String arg[]){
        int i=0, sum=0, num, var, formula;
        System.out.println("Enter a number:- ");
        Scanner sc=new Scanner(System.in);
        num = sc.nextInt();
        var = num;
        while(num>0){
            formula = num %10;
            sum = ((sum*10)+formula);
            num = num /10;
        }
        if (sum == var)
            System.out.println("The number is Palindrome.");
        else
            System.out.println("The number is not a Palindrome.");

    }
}