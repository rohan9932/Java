import java.util.Arrays;
import java.util.Scanner;

public class MultiDimArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][];

        int[][] arr2 = {
                {1, 2, 3},
                {4, 5},
                {7, 8, 9}
        };

        int[][] arr3 = new int[3][3];

        for (int row = 0; row < arr3.length; row++) {
            for (int col = 0; col < arr3[row].length; col++) {
                arr3[row][col] = input.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(arr3));
    }
}
