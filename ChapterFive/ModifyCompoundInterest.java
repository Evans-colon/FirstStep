package ChapterFive;

public class ModifyCompoundInterest {
    public static void main(String[] args) {


    }

    public static double compoundInterest(double amount) {
        double principal = 1_000;
        double rate = 0.05;
        int year = 1;

        System.out.printf("%s%s%20s%n", "year", "rate", "Amount on deposit");
        for (year = 1; year <= 10; year++) {
            for (rate = 0.05; rate <= 10; rate++) {
                amount = principal * Math.pow(1.0 + rate, year);

                System.out.printf("%4d%,%4d%,20.2f%n", year, rate, amount);
            }
        }
        return amount;
    }




}
