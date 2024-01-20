import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        int[] arr = {3, 1, 2, 4};
        int expected = 17;
        int actual = new Solution().sumSubarrayMins(arr);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        int[] arr = {11, 81, 94, 43, 3};
        int expected = 444;
        int actual = new Solution().sumSubarrayMins(arr);

        Assert.assertEquals(expected, actual);
    }

}
