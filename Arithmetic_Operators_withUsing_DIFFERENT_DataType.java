import java.util.*;
public class Arithmetic_Operators_withUsing_DIFFERENT_DataType {
    public static void main(String arg[]){
        int a,b,c;
        float x,y,z,k,p,q;
        String m,n,o;

        System.out.println("Enter the numbers: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = a+b;

        x = sc.nextFloat();
        y = sc.nextFloat();
        z = x+y;
        k = x*y;
        p = x/y;
        q = x%y;

        m = sc.next();
        n = sc.next();
        o = m+n;
        System.out.println("The sum of integer: "+c);
        System.out.println("The sum of float value: "+z);
        System.out.println("The multiplication of float value: "+k);
        System.out.println("The division of float value: "+p);
        System.out.println("The modula of float value: "+q);
        System.out.println("The string concatenation: "+o);
    }
}