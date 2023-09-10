import java.util.*;
public class CumulativeAdditionUsingDoWhileLoop {
    public static void main(String arg[]){
        int number, count=0, sum=0;
        System.out.println("Enter a number:- ");
        Scanner sc=new Scanner(System.in);
        number = sc.nextInt();
        do{
            sum = sum + count;
            count++;
        }while(count<=number);
        System.out.println("The sum is :" + sum);
    }
}