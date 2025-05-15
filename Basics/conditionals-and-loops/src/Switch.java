import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.nextLine().toLowerCase();

        //old syntax
//        switch (fruit) {
//            case "apple":
//                System.out.println("King of fruits.");
//                break;
//            case "banana":
//                System.out.println("My Favourite.");
//                break;
//            case "Grapes":
//                System.out.println("Small fruit");
//                break;
//            default:
//                System.out.println("Not fruit in the list");
//        }

        //New syntax
        switch (fruit) {
            case "apple" -> System.out.println("King of fruits.");
            case "orange" -> System.out.println("Round fruit");
            default -> System.out.println("Unknown fruit");
        }
    }
}
