import java.util.*;
public class Calculator
{
    public static void main(String arg[])
    {
        int a,b,d,e,f,g;
        System.out.println("enter a,b values");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        d=a-b;
        e=a*b;
        f=a/b;
        g=a%b;
        System.out.println("Substraction="+d);
        System.out.println("Multiplication="+e);
        System.out.println("Division="+f);
        System.out.println("Modulus="+g);
    }
}