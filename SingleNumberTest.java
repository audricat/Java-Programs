import org.junit.Test;  
import static org.junit.Assert.*;
public class SingleNumberTest {

    @Test
    public void testFindSingleNumberExample1() {
        int[] nums = { 2, 2, 1 };
        int expectedResult = 1;
        int result = SingleNumber.FindSingleNumber(nums);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testFindSingleNumberExample2() {
        int[] nums = { 4, 1, 2, 1, 2 };
        int expectedResult = 4;
        int result = SingleNumber.FindSingleNumber(nums);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testFindSingleNumberExample3() {
        int[] nums = {1};
        int expectedResult = 1;
        int result = SingleNumber.FindSingleNumber(nums);
        assertEquals(expectedResult, result);
    }
}
