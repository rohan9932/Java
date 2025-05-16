import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimArrList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initialization
        for (int i = 0; i < 3; i++) { // -> we need to add array list in the 2d arraylist
            list.add(new ArrayList<>());
        }

        //add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(input.nextInt());
            }
        }

        System.out.println(list);
    }
}
