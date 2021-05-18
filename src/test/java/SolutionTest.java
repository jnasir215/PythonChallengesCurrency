import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testCurrency1() {
        String money = "$100.24";
        Solution solution = new Solution();

        Assert.assertTrue(money.equals(solution.currency(100.238123123)));
    }

    @Test
    public void testCurrency2() {
        String money = "$5.20";
        Solution solution = new Solution();

        Assert.assertTrue(money.equals(solution.currency(5.2)));
    }
}
