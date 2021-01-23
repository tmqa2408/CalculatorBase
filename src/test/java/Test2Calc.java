import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2Calc {
    private Calculator underTest;

    @BeforeTest
    void setup() {
        underTest = new Calculator();
    }

    //@DisplayName("Testing addition")
    @Test
    public void test1() {
        final int first = 0;
        final int second = 0;
        final int expRes = 0;
        final int actResult = underTest.sum(first, second);

        Assert.assertEquals(actResult, expRes);
    }

    @Test
    public void test2() {
        final int first = 10;
        final int second = 0;
        final int expRes = 0;
        final int actResult = underTest.multiply(first, second);

        Assert.assertEquals(actResult, expRes);
    }
}
