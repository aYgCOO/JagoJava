import java.util.*;
public class FactorialNumber {
    public static void main(String arg[]){
        int fact = 1, i, number;
        System.out.println("Enter a number:- ");
        Scanner sc=new Scanner(System.in);
        number = sc.nextInt();
        for (i =1; i<=number; i++ ){
            fact = fact  * i;
        }
        System.out.println("The factorial number is:"+ fact);
    }
}