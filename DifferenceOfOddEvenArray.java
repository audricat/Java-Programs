import java.util.*;
public class DifferenceOfOddEvenArray {
    
    public static void main(String[] args) {
        int[] arr = new int[10];
        
        System.out.println("Difference between the numbers: " + calculateDifference(arr));
    
    }

    public static int calculateDifference (int[] arr){
        int odd = 0, even = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Input numbers: ");
        
        for (int value : arr) {
        value = scan.nextInt();
        //System.out.print(value);
        
        if (value%2 == 0) {
            even++;
        }
        else if (value%2 == 1) {
            odd++;
        }

        }
        
        scan.close();
        return Math.abs(odd-even);
    }
}
