import java.util.*;

public class BreakAndContinue {
    public static void main(String[] args) {
        int i;

        // Using a for loop
        for (i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Olaa!");
                break;
            }
            System.out.println(i);
        }

        // Using a while loop
        while (i < 10) {
            if (i == 8) {
                System.out.println("Hogaa!");
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
