public class SumOfArrayV1 
{

 public static void main(String[] args) 
 {
      int arr1[][] = {{1, 2, 3, 4, 5},
                      {2, 4, 6, 8, 10}};

      calculateSum(arr1);

 }

    public static void calculateSum(int[][] arr) { 
    {
        int sum = 0;

          for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
            {
              sum += arr[i][j];
            }
          
          System.out.println("Sum of Array " + i + ": " + sum);
          sum = 0;
        }
      }
    }
}
