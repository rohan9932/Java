import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        fun(5,3,3,2,2,3,34);
        fun();
        multiple(5, 3, "Rohan", "Rahim");
    }

    public static void multiple(int a , int b, String ...v) {
        System.out.println(a + b);
        System.out.println(Arrays.toString(v));
    }

    public static void  fun(int ...v) { //internally taking an array of integers (variable length arguments)
        System.out.println(Arrays.toString(v));
    }
}
