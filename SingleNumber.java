import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2 };
        System.out.println(FindSingleNumber(nums));
    }
    public static int FindSingleNumber(int[] nums) {
   Set<Integer> set = new HashSet<>();
    
    for (int num : nums) {
        if (!set.contains(num)) {
            set.add(num);
        } else {
            set.remove(num);
        }
    }
    
    for (int num : set) {
        return num;
    }
    
    return -1;
}

}
