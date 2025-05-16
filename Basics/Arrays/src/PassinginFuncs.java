import java.util.Arrays;

public class PassinginFuncs {
    public static void main(String[] args) {
        int[] nums = {3, 23 ,4 ,32, 3};
        System.out.println(Arrays.toString(nums));

        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void change(int[] arr) {
        arr[0] = 99; //mutability -> change the object
    }
}
