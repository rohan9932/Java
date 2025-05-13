import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;

        while(true) {
            System.out.print("Enter an operator (+, -, *, /, %) or 'x' to exit: ");
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter two numbers: ");
                int a = input.nextInt();
                int b = input.nextInt();
                if (op == '+') {
                    ans = a + b;
                    System.out.println(ans);
                } else if (op == '-') {
                    ans = a - b;
                    System.out.println(ans);
                } else if (op == '*') {
                    ans = a * b;
                    System.out.println(ans);
                } else if (op == '/') {
                    if (b != 0) {
                        ans = a / b;
                        System.out.println(ans);
                    } else {
                        System.out.println("Infinity!");
                    }
                } else {
                    ans = a % b;
                    System.out.println(ans);
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid operator!");
            }
        }
    }
}
