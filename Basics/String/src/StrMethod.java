import java.util.Arrays;

public class StrMethod {
    public static void main(String[] args) {
        String name = "Rohan Rahim";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.indexOf('n'));
        System.out.println("   Hello    ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
