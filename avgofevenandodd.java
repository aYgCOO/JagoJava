import java.util.*;
class avgofevenandodd {
    public static void main(String arg[]){
        int a,b,c;
        int result;
        Scanner avg = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a = avg.nextInt();
        System.out.println("Enter the value of b:");
        b = avg.nextInt();
        System.out.println("Enter the value of c:");
        c = avg.nextInt();

        result = (a+b+c)/3;
        System.out.println("The avg value is,"+result);
        if(result%2 == 0){
            System.out.println("The avg value is even "+result);
        } else{
            System.out.println("The avg value is odd "+result);

        }


    }
}