import java.util.*;

//    problem statement was like that we have to add all the elements of an array
//    except the element at the index.
// input = { 3, 7, 8, 4, 9 }

// output  ={ 28,24, 23, 27, 22 }

//Time complexity: O(2n)/O(n) linear

public class SumOfArrayExceptIndexInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);

        System.out.print("Input array size: ");
        int[] inputarr = new int[scan.nextInt()];
         System.out.print("Input number: ");
        for (int i = 0; i < inputarr.length; i++)
        {
           
            inputarr[i] = scan1.nextInt();
        }
        calculate(inputarr);
        scan.close();
        scan1.close();
    }

    public static void calculate(int[] inputarr) {
        int sum = 0, finalsum = 0;
        
        for(int i = 0; i < inputarr.length; i++) {
         sum += inputarr[i];
        }        
        
        for(int i = 0; i < inputarr.length; i++) {
        finalsum = sum - inputarr[i];
        System.out.print(finalsum + " ");
        }
            
    }
}
