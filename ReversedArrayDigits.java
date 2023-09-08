import java.util.*;

//Time complexity: O(n) linear

public class ReversedArrayDigits {
    public static void main (String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

       System.out.println(Arrays.toString(reversedArray(arr)));
    }

    public static int[] reversedArray(int[] arr){
        int num[] = new int[arr.length];
        int count = 0;

        for (int i = arr.length-1; i >= 0; i--) {
            num[count++] = arr[i];
        }

        return num;
    }
}
