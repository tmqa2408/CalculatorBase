import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCalculator {
    private Calculator underTest;

    @BeforeTest
    void setup() {
        underTest = new Calculator();
    }

    //@DisplayName("Testing addition")
    @Test
    public void test1() {
        final int first = 4;
        final int second = 8;
        final int expRes = 12;
        final int actResult = underTest.sum(first, second);

        Assert.assertEquals(actResult, expRes);
    }

    @Test
    public void test2() {
        final int first = 5;
        final int second = 8;
        final int expRes = -3;
        final int actResult = underTest.substract(first, second);

        Assert.assertEquals(actResult, expRes);
    }

    @Test
    public void test3() {
        final int first = 5;
        final int second = 8;
        final int expRes = 40;
        final int actResult = underTest.multiply(first, second);

        Assert.assertEquals(actResult, expRes);
    }

    @Test
    public void test4() {
        final int first = 0;
        final int second = 8;
        final int expRes = 0;
        final int actResult = underTest.multiply(first, second);

        Assert.assertEquals(actResult, expRes);
    }

    @Test
    public void test5() {
        final int first = 40;
        final int second = 5;
        final int expRes = 8;
        final int actResult = underTest.divide(first, second);

        Assert.assertEquals(actResult, expRes);
    }

    @Test
    public void test6() {
        final int first = 5;
        final int second = 0;

        Assert.assertThrows(IllegalArgumentException.class,
                () -> underTest.divide(first, second));
    }
}
