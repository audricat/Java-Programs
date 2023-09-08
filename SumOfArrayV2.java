public class SumOfArrayV2 {
    public static void main(String[] args) {
        int arr1[][] = {{ 1, 2, 3, 4, 5 },
                        { 2, 4, 6, 8, 10 }};

        calculateSum(arr1);
    }

    public static void calculateSum(int[][] arr) {
        {
            int sum = 0, i = 0;
                
            /*for each row in arr, store in row[]
            it will not stop unless not finished 
            iterating in each row of arr*/
            for (int[] row : arr) { /*in short, from multidimensional array, 
                                    row becomes a single array*/
                //System.out.println(Arrays.toString(row));

                for (int col : row) { //for each column in row[], store in col
                    sum += col; //will iterate through the row, store and added in sum
                }
            
                System.out.println("Sum of Array " + i + ": " + sum); // print the sum
               
                sum = 0; //make sum equal to zero for second iteration
                i++;

            }
        }
    }
}
