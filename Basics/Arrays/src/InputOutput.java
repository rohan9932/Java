import java.util.Arrays;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(nums));
    }
}
