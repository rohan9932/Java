public class Scope {
    public static void main(String[] args) {
        int a = 1;
        {
            //int a = 78; //already initialized outside the block in the same, hence you can't initialize again
            a = 100; //reassign the original ref variable to some other value
            System.out.println(a);
            int c = 9;
            //values initialized in this block will remain in block
        }
        //System.out.println(c); // cannot use outside the block
        System.out.println(a);

        //scoping in for loop
        for (int i = 0; i < 10; i++) {
            System.out.println(i); // i is only on the for loop
        }
    }
}
