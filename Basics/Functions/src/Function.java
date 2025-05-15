import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        System.out.println(sum());
    }

    /*
    access_modifier return_type name (parameters) {
        //code blocks
        return statement;
    }
     */

    public static int sum() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        return a + b;
    }
}
