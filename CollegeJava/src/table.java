import java.util.*;
public class table {
    public static void main(String arg[]){
        int x, i, a;
        System.out.println("x:-" );
        Scanner sc=new Scanner(System.in);
        x= sc.nextInt();

        for(i=1;i<11;i++){
            a = x*i;
            System.out.println(a);

        }
    }
}