import java.util.*;
public class Rectangle{
    public static void main(String arg[]){
        int a,b,c,d;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length:- ");
        a=s.nextInt();
        System.out.println("Enter the breath:- ");
        b=s.nextInt();
        c=a*b;
        d=2*(a+b);
        System.out.println("Area is: "+c);
        System.out.println("Perimiter is: "+d);
    }
}