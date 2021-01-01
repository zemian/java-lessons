package zemian.commontasks;

import org.junit.Assert;
import org.junit.Test;

public class CalcTest {
    @Test
    public void sum() {
        Calc calc = new Calc();
        Assert.assertEquals(2, calc.sum(1, 1));
        Assert.assertNotEquals(4, calc.sum(1, 1));
    }
}
