import java.util.*;

public class TwoSum {
    public static void main(String[] args)
    {
        int[] numbers = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(CalcTwoSum(numbers, target))); 

        int[] nums1 = {3,2,4};
        target = 6;

        System.out.println(Arrays.toString(CalcTwoSum(nums1, target))); 

        int[] nums2 = {3,3};
        target = 6;

        System.out.println(Arrays.toString(CalcTwoSum(nums2, target))); 
       

    }

    public static int[] CalcTwoSum(int[] nums, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
        {
            int complement = target - nums[i];

            if (map.containsKey(complement))
            {
                return new int[] {map.get(complement), i};
            }

            map.put(nums[i], i);
        }

       return new int[]{}; 
   }
}
