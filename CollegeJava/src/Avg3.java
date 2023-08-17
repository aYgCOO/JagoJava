import java.util.*;
public class Avg3 {
    public static void main(String arg[]){
        int a,b,c,avg;
        System.out.println("Enter the value of a:- ");
        Scanner sc=new Scanner(System.in);
        a= sc.nextInt();
        System.out.println("Enter the value of a:- ");
        Scanner s=new Scanner(System.in);
        b= s.nextInt();
        System.out.println("Enter the value of a:- ");
        Scanner scc=new Scanner(System.in);
        c= scc.nextInt();

        avg = (a+b+c)/3;
        System.out.println("The average is:- ");
        System.out.println(avg);

    }
}