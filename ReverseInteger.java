
public class ReverseInteger {
    public static void main(String[] args) {
        int input = -120;
        System.out.println(ReverseInt(input));
    }

    public static int ReverseInt(int x) {
        int result = 0;
        boolean isNegative = x < 0;
        
        x = Math.abs(x);

        while (x != 0) {
            if (result > (Integer.MAX_VALUE - x % 10) / 10) {
                return 0;
            }
            
            result = result * 10 + x % 10;
            x /= 10;
        }
        
        return isNegative ? -result : result;
    }

}
