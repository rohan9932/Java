public class Overloading {
    public static void main(String[] args) {
        fun();
        fun(10, 9);
    }

    public static void fun() {
        System.out.println("Normal");
    }

    public static void fun(int a, int b) {
        System.out.println(a + b);
    }
}
