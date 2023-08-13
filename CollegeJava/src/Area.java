import  java.util.*;
public class Area {
    public static void  main(String arg[]){
        int r ;
        double s, pi = 3.14;
        System.out.println("Enter r value");
        Scanner sc=new Scanner(System.in);
        r = sc.nextInt();
        s= pi*r*r;
        System.out.println("area is"+s);


    }
}