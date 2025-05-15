public class Question {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if(isArmStrong(i)) System.out.println(i);
        }
    }

    public static boolean isArmStrong(int n) {
        int temp = n;
        int ans = 0;
        while (temp > 0) {
            int digit = temp % 10;
            ans += digit*digit*digit;
            temp /= 10;
        }
        return ans == n;
    }
}
