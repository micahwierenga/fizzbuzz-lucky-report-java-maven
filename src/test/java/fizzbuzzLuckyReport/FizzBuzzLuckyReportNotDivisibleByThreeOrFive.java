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
public class FizzBuzzLuckyReportNotDivisibleByThreeOrFive {
    private Integer num;
    private String expectedResult;
    private FizzBuzzLuckyReport fizzbuzzLuckyReport;

    @Before
    public void initialize() {
        fizzbuzzLuckyReport = new FizzBuzzLuckyReport();
    }

    public FizzBuzzLuckyReportNotDivisibleByThreeOrFive(Integer num, String expectedResult) {
        this.num = num;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection nums() {
        return Arrays.asList(new Object[][] {
                {1, "1"},
                {2, "2"},
                {4, "4"},
                {7, "7"},
                {8, "8"},
                {11, "11"},
                {14, "14"},
                {16, "16"},
                {17, "17"},
                {19, "19"},
                {51, "51"},
                {401, "401"},
        });
    }

    @Test
    public void returnsFizzbuzzSeries() {
        assertEquals(expectedResult, fizzbuzzLuckyReport.testDivisorsAndSubstring(num));
    }
}