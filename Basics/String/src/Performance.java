public class Performance {
    public static void main(String[] args) {
        String alphabets = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            alphabets += ch; //new obj being created every time -> leads to memory wastage O(n^2) TC
        }
        System.out.println(alphabets);

        //For changing in original object => String Builder
        StringBuilder builder = new StringBuilder(); //mutable
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);
    }
}
