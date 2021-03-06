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
public class FizzBuzzLuckyReportSeriesReportTest {
    private Integer num;
    private String prop;
    private String expectedResult;
    private FizzBuzzLuckyReport fizzbuzzLuckyReport;

    @Before
    public void initialize() {
        fizzbuzzLuckyReport = new FizzBuzzLuckyReport();
    }

    public FizzBuzzLuckyReportSeriesReportTest(Integer num, String prop, String expectedResult) {
        this.num = num;
        this.prop = prop;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection nums() {
        return Arrays.asList(new Object[][] {
                {10, "buzz", "buzz: 2"},
                {20, "fizz", "fizz: 4"},
                {50, "fizzbuzz", "fizzbuzz: 2"},
                {15, "integer", "integer: 7"},
                {100, "lucky", "lucky: 19"},
        });
    }

    @Test
    public void returnsFizzBuzzLuckyReport() {
        String fizzbuzzReport = fizzbuzzLuckyReport.printSeries(num);
        Report report = fizzbuzzLuckyReport.returnReport();
        assertEquals(expectedResult, report.generateReportItem(prop));
    }
}