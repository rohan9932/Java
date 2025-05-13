public class TypeCasting {
    public static void main(String[] args) {
        //typecasting
        int a = (int)(56.36f);
        System.out.println(a);

        //automatic type promotion in expressions
        int b = 259;
        byte c = (byte)b; // 259 % 256 = 3
        System.out.println(c);

        byte d = 50;
        byte f = 60;
        int g = d * f; // automatically typecasting these to int data type while performing operations
        System.out.println(g);

        System.out.println("অভিনন্দন");
    }
}
