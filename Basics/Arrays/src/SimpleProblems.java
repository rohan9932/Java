import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SimpleProblems {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 1; i <= 10; i++) {
            nums.add(i);
        }

        System.out.println(max(nums));
        System.out.println(max(nums, 1, 5));

        //reverse array
        reverse(nums);
        System.out.println(nums);
    }

    public static int max(ArrayList<Integer> arr) {
        if(arr == null || arr.size() == 0) {
            return -1;
        }
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }

        return max;
    }

    public static int max(ArrayList<Integer> arr, int idx1, int idx2) {
        if(arr == null || arr.size() == 0) {
            return -1;
        }
        if(idx2 > idx1) {
            return -1;
        }
        int max = arr.get(idx1);
        for (int i = idx1+1; i <= idx2; i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }

        return max;
    }

    public static void swap(ArrayList<Integer> arr, int idx1, int idx2) {
        int temp = arr.get(idx1);
        arr.set(idx1, arr.get(idx2));
        arr.set(idx2, temp);
    }

    public static void reverse(ArrayList<Integer> arr) {
        if(arr == null || arr.size() == 0) {
            return;
        }
        int st = 0, end = arr.size() - 1;
        while(st <= end) {
            swap(arr, st, end);
            st++;
            end--;
        }
    }
}
