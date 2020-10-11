package fizzbuzzLuckyReport;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FizzBuzzLuckyReportDivisibleByFiveTest {
    private Integer num;
    private String expectedResult;
    private FizzBuzzLuckyReport fizzbuzzLuckyReport;

    @Before
    public void initialize() {
        fizzbuzzLuckyReport = new FizzBuzzLuckyReport();
    }

    public FizzBuzzLuckyReportDivisibleByFiveTest(Integer num, String expectedResult) {
        this.num = num;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection nums() {
        return Arrays.asList(new Object[][] {
                {5, "buzz"},
                {10, "buzz"},
                {20, "buzz"},
                {50, "buzz"},
                {110, "buzz"},
                {700, "buzz"},
        });
    }

    @Test
    public void returnsBuzzWhenDivisibleByFive() {
        assertEquals(expectedResult, fizzbuzzLuckyReport.testDivisorsAndSubstring(num));
    }
}