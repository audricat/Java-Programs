public class SumOfArrayV2Clean {
    public static void main(String[] args) {
        int arr1[][] =  {{ 1, 2, 3, 4, 5 },
                        { 2, 4, 6, 8, 10 }};

        calculateSum(arr1);
    }

    public static void calculateSum(int[][] arr) {
        {
            int sum = 0, i = 0;

            for (int[] row : arr) { 
                for (int col : row) {
                    sum += col;
                }
                System.out.println("Sum of Array " + i + ": " + sum); 
                sum = 0;
                i++;

            }
        }
    }
}
