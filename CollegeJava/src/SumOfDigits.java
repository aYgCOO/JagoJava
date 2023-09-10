import java.util.*;
public class SumOfDigits {
    public static void main(String arg[]){
        int i=0,sum=0,n,r;
        System.out.println("enter  numbers: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;n>0;i++){
            r=n%10;
            sum=sum+r;
            n=n/10;

        }
        System.out.println(sum);
    }
}