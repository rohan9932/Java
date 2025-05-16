import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //similar to vector in cpp -> internally arraylist also works similar like vector O(1)
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10); //wrapper classes
        for (int i = 1; i <= 100 ; i++) {
            list.add(i);
        }
        System.out.println(list.contains(323));
        list.set(1, 323);
        list.remove(0);
        System.out.println(list);

        //input output
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list2.add(input.nextInt());
        }

        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }
    }
}
