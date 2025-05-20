import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        // In simple terms all objects are called toString method in println

        //Here operators are giving us more functionality -> Operator Overloading
        System.out.println('a' + 'b'); //changes char -> ascii val and addition it
        System.out.println("a" + "b"); //str concatenation
        System.out.println((char)('a' + 5));

        System.out.println("a" + 1); //1 is converted to wrapper class Integer and there tostring is called -> "a" + "1"

        System.out.println("Rohan" + new ArrayList<>());

        //System.out.println(57 + new ArrayList<>());
        // => Error because in Java between the + operators atleast one of the objects have to be string
        //becuase operator overloading is only supported for string in java not any other objects

        System.out.println(57 + "" + new ArrayList<>());
    }
}
