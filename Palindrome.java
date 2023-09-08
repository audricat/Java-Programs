import java.util.Arrays;

public class Palindrome {
    public static void main (String[] args) {
        String input = "racecar";
        System.out.println(checkPalindrome(input));
    }

    public static boolean checkPalindrome(String input) {
        int j = 0;
        char[] chars = input.toCharArray();
        char[] output = new char[chars.length];
        for(int i = chars.length- 1; i >= 0; i--) {
            output[j++] = chars[i];
        }

        System.out.println(input.toCharArray());
        System.out.println(output);

        if (Arrays.equals(input.toCharArray(), output)) {
            return true;
        }
        return false;

    }
}
