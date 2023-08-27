import java.util.*;
public class Fortable {
    public static void main(String arg[]){
        int table, formula, i;
        System.out.println("Table :-");
        Scanner sc=new Scanner(System.in);
        table = sc.nextInt();
        System.out.println("__________");
        for (i=1; i<11; i++){
            formula = table*i;
            System.out.println(table +" * "+i+"= "+formula);
        }
    }
}