public class Comparison {
    public static void main(String[] args) {
        String a = "Rohan";
        String b = "Rohan";

        // == Gives True if pointing to same obj else False
        System.out.println(a == b); //true because same obj

        //create a new object of same value
        String c = new String("Rohan"); // creating object outside of string pool but in heap
        System.out.println(c == a); //false because diff obj

        //when we only need to compare value we use .
        System.out.println(c.equals(a)); //just comparing value
    }
}
