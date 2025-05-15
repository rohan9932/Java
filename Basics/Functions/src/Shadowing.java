public class Shadowing {
    static int x = 32; //shadowed at line 5
    public static void main(String[] args) {
        System.out.println(x); //32
        int x = 322; //overlapped by 322 -> shadowing
        System.out.println(x); //322
        fun();//32
    }

    public static void fun() {
        System.out.println(x);
    }
}
