import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();

        if(salary > 100000) {
            salary += 5000;
        } else if (salary > 50000) {
            salary += 3000;
        } else {
            salary += 1500;
        }

        System.out.println(salary);
    }
}