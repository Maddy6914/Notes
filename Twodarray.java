import java.util.*;

public class Twodarray {
    public static void main(String a[]) {
        // Step 1: Initialize a 2D array with 3 rows and a fixed column size (e.g., 3).
        int[][] arr = new int[3][3];
        Scanner s = new Scanner(System.in);

        // Step 2: Input values for each element of the 2D array.
        System.out.println("Enter 9 integers:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        // Step 3: Output each row to check values.
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }

        s.close();
    }
}

