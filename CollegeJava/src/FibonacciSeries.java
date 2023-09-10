import java.util.*;
public class FibonacciSeries {
    public static void main(String arg[]){
        int number, x, y, sum, count=0;
        x=0;
        y=1;
        System.out.println("Enter a value:- ");
        Scanner sc=new Scanner(System.in);
        number = sc.nextInt();
        System.out.println("The Fibonacci series is:");
        while (count<number){
            System.out.println( x + "\t");
            sum = x+y;
            x=y;
            y=sum;
            count++;
        }

    }
}