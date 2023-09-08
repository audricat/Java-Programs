public class SumOfArrayOrig 
{

 public static void main(String[] args) 
 {
      int arr1[] = {1, 2, 3, 4, 5};
      int arr2[] = {2, 4, 6, 8, 10};

      System.out.println(calculateSum(arr1));
      System.out.println(calculateSum(arr2));

 }

    public static int calculateSum(int[] arr) 
    {
        int sum = 0;

          for (int i = 0; i < arr.length; i++) 
          {
          sum += arr[i];
          }

        return sum;
    }
}