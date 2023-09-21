import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseIntegerTest {
    @Test
    public void TestReverseIntPositive() {
        assertEquals(321, ReverseInteger.ReverseInt(123));
        assertEquals(0,ReverseInteger.ReverseInt(Integer.MAX_VALUE));
        assertEquals(21,ReverseInteger.ReverseInt(120));
        assertEquals(-321, ReverseInteger.ReverseInt(-123));
    }
}
