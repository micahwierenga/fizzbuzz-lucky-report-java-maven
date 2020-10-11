package fizzbuzzLuckyReport;

import java.lang.*;
import java.lang.reflect.*;

public class FizzBuzzLuckyReport {
    private String seriesString = "";
    private String reportString = "";
    private Report report;

    public FizzBuzzLuckyReport() {
        report = new Report();
    }

    public String printSeries(int num) {
        String spacer = " ";
        for (int i=1; i<=num; i++) {
            seriesString += testDivisorsAndSubstring(i);
            if(i!=num) seriesString += spacer;
        }
        System.out.println(seriesString);
        generateReport();
        return seriesString;
    }

    public String testDivisorsAndSubstring(int num) {
        String strNum = Integer.toString(num);
        if(strNum.contains("3")) {
            report.lucky++;
            return "lucky";
        } else if(num % 15 == 0) {
            report.fizzbuzz++;
            return "fizzbuzz";
        } else if(num % 5 == 0) {
            report.buzz++;
            return "buzz";
        } else if(num % 3 == 0) {
            report.fizz++;
            return "fizz";
        } else {
            report.integer++;
            return Integer.toString(num);
        }
    }

    public void generateReport() {
        String lineBreak = "\n";
        Field[] fields = report.getClass().getDeclaredFields();
        for (int i=0; i<fields.length; i++) {
            this.reportString += report.generateReportItem(fields[i].getName());
            if(i!=fields.length-1) this.reportString += lineBreak;
        }
        System.out.println(this.reportString);
    }

    public Report returnReport() {
        return report;
    }
}



