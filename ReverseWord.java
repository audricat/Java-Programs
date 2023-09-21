public class ReverseWord {
    public static void main (String[] args) {
        String input = "shanen"; //nenahs
        Reversal(input);
    }

    public static void Reversal(String input) {
        int j = 0;
        char[] chars = input.toCharArray();
        char[] output = new char[chars.length];
        for(int i = chars.length- 1; i >= 0; i--) {
            output[j++] = chars[i];
        }

        System.out.println(input.toCharArray());
        System.out.println(output);
    }
}
