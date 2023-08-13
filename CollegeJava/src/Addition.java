import java.io.*;
public class Addition
{
    public static void main(String arg[]) throws IOException
    {
        int a,b,c;
        System.out.println("enter a,b values");
        DataInputStream n=new DataInputStream(System.in);
        a=Integer.parseInt(n.readLine());
        b=Integer.parseInt(n.readLine());
        c=a+b;
        System.out.println("sum="+c);
    }
}