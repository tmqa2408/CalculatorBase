import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3Calc {
    private Calculator underTest;

    @BeforeTest
    void setup() {
        underTest = new Calculator();
    }

    @Test
    public void test3() {
        final int first = 5;
        final int second = 0;
        final int expRes = 0;
        final int actResult = underTest.multiply(first, second);

        Assert.assertEquals(actResult, expRes);
    }

    @Test
    public void test4() {
        final int first = 10;
        final int second = 8;
        final int expRes = 80;
        final int actResult = underTest.multiply(first, second);

        Assert.assertEquals(actResult, expRes);
    }
}
