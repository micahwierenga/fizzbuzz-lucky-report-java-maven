package fizzbuzzLuckyReport;

import java.lang.*;

public class Report {
    public int fizz = 0;
    public int buzz = 0;
    public int fizzbuzz = 0;
    public int lucky = 0;
    public int integer = 0;

    public String generateReportItem(String reportProp) {
        if(reportProp == "fizz") {
            return String.format("fizz: " + fizz);
        } else if(reportProp == "buzz") {
            return String.format("buzz: " + buzz);
        } else if(reportProp == "fizzbuzz") {
            return String.format("fizzbuzz: " + fizzbuzz);
        } else if(reportProp == "lucky") {
            return String.format("lucky: " + lucky);
        } else {
            return String.format("integer: " + integer);
        }
    }
}