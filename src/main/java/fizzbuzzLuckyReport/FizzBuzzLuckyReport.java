package fizzbuzzLuckyReport;

public class FizzBuzzLuckyReport {
    private int fizzTotal = 0;
    private int buzzTotal = 0;
    private int fizzbuzzTotal = 0;
    private int luckyTotal = 0;
    private int intTotal = 0;

    public String printSeries(int num) {
        for (int i=1; i<=num; i++) {
            System.out.println(testDivisorsAndSubstring(i));
        }

        return generateReport();
    }

    public String testDivisorsAndSubstring(int num) {
        String strNum = Integer.toString(num);
        if(strNum.contains("3")) {
            this.luckyTotal++;
            return "lucky";
        } else if(num % 15 == 0) {
            this.fizzbuzzTotal++;
            return "fizzbuzz";
        } else if(num % 5 == 0) {
            this.buzzTotal++;
            return "buzz";
        } else if(num % 3 == 0) {
            this.fizzTotal++;
            return "fizz";
        } else {
            this.intTotal++;
            return Integer.toString(num);
        }
    }

    public String generateReport() {
        return String.format("fizz: %d, buzz: %d, fizzbuzz: %d, lucky: %d, integer: %d", this.fizzTotal, this.buzzTotal, this.fizzbuzzTotal, this.luckyTotal, this.intTotal);
    }
}

