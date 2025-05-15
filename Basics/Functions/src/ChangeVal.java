import java.util.Arrays;

public class ChangeVal {
    public static void main(String[] args) {
        //create an array
        int[] arr = {1,2,3,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void change(int[] nums) { //as it isn't a primitive data so it's reference object will be passed
        nums[0] = 99; //if we make a change via this ref. var., main object will be changed
    }
}
