import java.util.*;
public class Greatesnum {
    public static void main(String arg[]){
        int a,b,c;
        System.out.println("Enter the value of a:- ");
        Scanner s=new Scanner(System.in);
        a= s.nextInt();
        System.out.println("Enter the value of b:- ");
        Scanner sc=new Scanner(System.in);
        b= sc.nextInt();
        System.out.println("Enter the value of c:- ");
        Scanner sce=new Scanner(System.in);
        c= sce.nextInt();

        if (a>b && a>c)
            System.out.println("a is greatest.");
        else if (b>a && b>c)
            System.out.println("b is greatest.");
        else
            System.out.println("c is greatest.");

    }
}