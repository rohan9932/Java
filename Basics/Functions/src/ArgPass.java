public class ArgPass {
    public static void main(String[] args) {
        String name = "Rohan";
        change(name);
        System.out.println(name);
    }

    public static void change (String naam) {
        naam = "Rahim"; //not changing, creating a object (so not changing original)
    }
}
