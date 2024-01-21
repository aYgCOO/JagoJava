import java.util.*;
public class inputarr_and_sum {
    public static void main(String arg[]){
        int[] num = new int[10];
        int i,j, sum = 0;
        Scanner arr = new Scanner(System.in);
        System.out.println("Enter the value of array: ");
        for(i = 0; i < num.length; i ++ ){
            num[i] = arr.nextInt();

        }for(j = 0; j < num.length; j++){
            sum = sum + num[j];
        }System.out.println("The sum of the array element is, " + sum);
    }

}
