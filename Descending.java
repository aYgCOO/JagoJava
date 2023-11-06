import java.util.*;

public class Descending {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int i, j, temp;
        System.out.println("Enter the values of the array: ");
        Scanner array = new Scanner(System.in);

        for (i = 0; i < arr.length; i++) {
            arr[i] = array.nextInt();
        }

        // Sorting the array in descending order
        for (i = 0; i < arr.length - 1; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Descending order:");
        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
