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
public class FizzbuzzLuckyReportSeriesTest {
    private Integer num;
    private String expectedResult;
    private FizzBuzzLuckyReport fizzbuzzLuckyReport;

    @Before
    public void initialize() {
        fizzbuzzLuckyReport = new FizzBuzzLuckyReport();
    }

    public FizzbuzzLuckyReportSeriesTest(Integer num, String expectedResult) {
        this.num = num;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection nums() {
        return Arrays.asList(new Object[][] {
                {10, "1 2 lucky 4 buzz fizz 7 8 fizz buzz"},
                {20, "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz"},
                {100, "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz fizz 22 lucky fizz buzz 26 fizz 28 29 lucky lucky lucky lucky lucky lucky lucky lucky lucky lucky buzz 41 fizz lucky 44 fizzbuzz 46 47 fizz 49 buzz fizz 52 lucky fizz buzz 56 fizz 58 59 fizzbuzz 61 62 lucky 64 buzz fizz 67 68 fizz buzz 71 fizz lucky 74 fizzbuzz 76 77 fizz 79 buzz fizz 82 lucky fizz buzz 86 fizz 88 89 fizzbuzz 91 92 lucky 94 buzz fizz 97 98 fizz buzz"},
        });
    }

    @Test
    public void returnsFizzbuzzLuckyReportSeries() {
        String actual = fizzbuzzLuckyReport.printSeries(num);
        assertEquals(expectedResult, actual);
    }
}