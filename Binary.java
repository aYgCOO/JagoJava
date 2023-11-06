import java.util.*;
public class Binary {
    public static void main(String arg[]){
        int sum = 0, num, x;
        System.out.println("Enter the value: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while(num>0){
            x = num%2;
            sum = sum*10+x;
            num = num/2;

        }
        System.out.println("Binary Number is: "+sum);
    }
}