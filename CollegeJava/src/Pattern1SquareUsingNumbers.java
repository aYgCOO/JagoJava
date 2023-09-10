import java.util.*;

public class Pattern1SquareUsingNumbers {
    public static void main(String arg[]) {
        int i, j, number;
        System.out.println("Enter a number sequence: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        for (i = 1; i <= number; i++) {
            for (j = 1; j <= number; j++) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}
