

//    problem statement was like that we have to add all the elements of an array
//    except the element at the index.
// input = { 3, 7, 8, 4, 9 }

// output  ={ 28,24, 23, 27, 22 }

//Time complexity: O(n) linear

public class SumOfArrayExceptIndex {
    public static void main(String[] args) {
        int[] inputarr = {3, 7, 8, 4, 9};
        calculate(inputarr);
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
