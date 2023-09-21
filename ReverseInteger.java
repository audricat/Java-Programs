public class ReverseInteger {
    public static void main(String[] args) {
        int input = -120;
        System.out.println(ReverseInt(input));
    }

    public static int ReverseInt(int x) {
        int result = 0;
        boolean isNegative = x < 0;
        
        // Convert x to a positive number to handle it
        x = Math.abs(x);

        while (x != 0) {
            // Check for integer overflow before updating the result
            if (result > (Integer.MAX_VALUE - x % 10) / 10) {
                return 0; // Overflow occurred
            }
            
            result = result * 10 + x % 10;
            x /= 10;
        }
        
        // Add the negative sign back if the original number was negative
        return isNegative ? -result : result;
    }
}
