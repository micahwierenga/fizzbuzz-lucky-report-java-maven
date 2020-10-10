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
    private String expectedResult;
    private FizzBuzzLuckyReport fizzbuzzLuckyReport;

    @Before
    public void initialize() {
        fizzbuzzLuckyReport = new FizzBuzzLuckyReport();
    }

    public FizzBuzzLuckyReportSeriesReportTest(Integer num, String expectedResult) {
        this.num = num;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection nums() {
        return Arrays.asList(new Object[][] {
                {20, String.format("fizz: 4, buzz: 3, fizzbuzz: 1, lucky: 2, integer: 10")},
        });
    }

    @Test
    public void returnsFizzBuzzLuckyReport() {
        String report = fizzbuzzLuckyReport.printSeries(num);
        System.out.println(report);
        assertEquals(expectedResult, fizzbuzzLuckyReport.generateReport());
    }
}