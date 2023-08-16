import java.util.*;
public class leapear {
    public static void main(String arg[]){
        int year;
        System.out.println("Enter a year :- ");
        Scanner sc=new Scanner(System.in);
        year = sc.nextInt();
        if  (year%4 == 0)
            System.out.println("The year is leap year.");
        else
            System.out.println("The year is not a leap year.");
    }
}