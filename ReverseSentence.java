import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String input = "Programming is fun!";

        System.out.println(Reverse(input));
    }

    public static String Reverse(String input)
    {
        String[] output = input.split(" ");
        System.out.println(Arrays.toString(output));
        String[] words = new String[output.length];
        int j = 0;
        for (int i = output.length - 1; i >= 0; i--) {
            words[j++] = output[i];
        }
        return Arrays.toString(words);
    }
}
