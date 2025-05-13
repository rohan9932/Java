import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Q. Print numbers from 1 to n
        int n = input.nextInt();

        //For loop
        for(int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");

        //While loop
        int i = 1;
        while(i <= n) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("");

        //do while
        i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while(i <= n);
    }
}
