import java.util.*;

//Time complexity: O(n) linear

public class ReversedArrayInput {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of names: ");

        String[] name = new String[scan.nextInt()];
        for (int i = 0; i < name.length - 1; i++) {
        System.out.print("Input name: ");
        name[i] = scan.next();
        }
        

        System.out.println(Arrays.toString(reversedArray(name)));
        scan.close();
    }

    public static String[] reversedArray(String[] name) {
        String[] names = new String[name.length];
        int count = 0;

        for (int i = name.length-1; i >=0; i--) {
            names[count++] = name[i];
        }

        return names;
    }
}
