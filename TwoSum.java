public class TwoSum {
    public static void main(String[] args)
    {
        int[] b = {2,7,11,15};
        int target = 9;

        for (int i = 0; i < b.length; i++) 
        {
            int sum = b[i+1];
            if (b[i] + sum == target)
            {
                System.out.println(i);
            }


            System.out.println(i);
        }
    }
}
