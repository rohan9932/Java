public class Palindrome {
    public static void main(String[] args) {
        if(isPalindrome("aba")) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    public static boolean isPalindrome(String s) {
        if(s == null || s.isEmpty()) return true;

        s = s.toLowerCase();
        int st = 0, end = s.length() - 1;

        while (st <= end) {
            if (s.charAt(st) != s.charAt(end)) {
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
}
